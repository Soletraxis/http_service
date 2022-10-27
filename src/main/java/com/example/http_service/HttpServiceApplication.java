package com.example.http_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HttpServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpServiceApplication.class, args);
    }

}
