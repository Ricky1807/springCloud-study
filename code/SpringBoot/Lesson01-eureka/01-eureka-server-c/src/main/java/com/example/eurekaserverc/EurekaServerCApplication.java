package com.example.eurekaserverc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerCApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCApplication.class, args);
    }

}
