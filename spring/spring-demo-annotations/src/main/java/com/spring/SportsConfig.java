package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.spring")
@PropertySource("sports.properties")
public class SportsConfig {

    @Bean
    public List<String> arrayList() {
        return Arrays.asList("java", "js", "python");
    }
}
