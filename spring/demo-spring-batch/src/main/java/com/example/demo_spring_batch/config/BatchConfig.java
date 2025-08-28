package com.example.demo_spring_batch.config;

import com.example.demo_spring_batch.entity.Profile;
import com.example.demo_spring_batch.entity.User;
import com.example.demo_spring_batch.repository.ProfileRepository;
import com.example.demo_spring_batch.repository.UserRepository;
import com.example.demo_spring_batch.service.JobCompletionNotificationListener;
import com.example.demo_spring_batch.service.ProfileItemProcessor;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@AllArgsConstructor
public class BatchConfig {

    private UserRepository userRepository;
    private ProfileRepository profileRepository;
    private ProfileItemProcessor profileItemProcessor;

    @Bean
    public RepositoryItemReader<User> reader() {
        RepositoryItemReader<User> reader = new RepositoryItemReader<>();
        reader.setRepository(userRepository);
        reader.setMethodName("findByStatusAndEmailVerified");

        List<Object> queryMethodArguments = new ArrayList<>();
        queryMethodArguments.add("APPROVED");
        queryMethodArguments.add(true);
        reader.setArguments(queryMethodArguments);
        reader.setPageSize(100);

        Map<String, Sort.Direction> sorts = new HashMap<>();
        sorts.put("id", Sort.Direction.DESC);
        reader.setSort(sorts);

        return reader;
    }

    @Bean
    public RepositoryItemWriter<Profile> writer() {
        RepositoryItemWriter<Profile> writer = new RepositoryItemWriter<>();
        writer.setRepository(profileRepository);
        writer.setMethodName("save");
        return writer;
    }

    @Bean
    public Step step1(JobRepository jobRepository, ItemReader<User> itemReader, ItemWriter<Profile> itemWriter,
                      PlatformTransactionManager transactionManager) {
        int chunkSize = 5;

        return new StepBuilder("step1", jobRepository)
                .<User, Profile>chunk(chunkSize, transactionManager)
                .reader(itemReader)
                .processor(profileItemProcessor)
                .writer(itemWriter)
                .build();
    }

    @Bean
    public Job profileUpdateJob(JobCompletionNotificationListener listener, JobRepository jobRepository, Step step1) {
        return new JobBuilder("profileUpdateJob", jobRepository)
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(step1)
                .build();
    }

    @Bean
    PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager();
    }
}
