package com.example.springbootreactive.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springbootreactive")
@EntityScan(basePackages = "com.example.springbootreactive")
@EnableReactiveMongoRepositories(basePackages = "com.example.springbootreactive")
public class SpringBootReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReactiveApplication.class, args);
    }

}
