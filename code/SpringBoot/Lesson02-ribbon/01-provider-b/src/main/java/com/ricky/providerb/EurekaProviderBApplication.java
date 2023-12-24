package com.ricky.providerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProviderBApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderBApplication.class, args);
    }

}
