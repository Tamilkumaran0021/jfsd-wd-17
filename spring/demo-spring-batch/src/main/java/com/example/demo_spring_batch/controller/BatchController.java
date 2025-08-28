package com.example.demo_spring_batch.controller;

import com.example.demo_spring_batch.entity.User;
import com.example.demo_spring_batch.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
@AllArgsConstructor
public class BatchController {

    private JobLauncher jobLauncher;
    private Job job;

    private UserRepository userRepository;

    @PostMapping("/start")
    public ResponseEntity<BatchStatus> startBatch() {
        JobExecution jobExecution = null;

        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("uniqueId", System.currentTimeMillis()).toJobParameters();
        try {
            jobExecution = jobLauncher.run(job, jobParameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(jobExecution.getStatus());
    }


    @PostMapping("/user")
    public ResponseEntity<User> startBatch(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

}
