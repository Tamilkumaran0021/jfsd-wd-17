package com.example.demo_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringbootApplication.class, args);
//        String[] beans = applicationContext.getBeanDefinitionNames();
//        for (String bean : beans) {
//            System.out.println(bean);
//        }

    }

}
