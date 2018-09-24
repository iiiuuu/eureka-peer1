package com.example.eurekapeer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPeer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaPeer1Application.class, args);
    }
}
