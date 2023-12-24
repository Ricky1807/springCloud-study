package com.rickly.eurekaclientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZQQ
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientBApplication.class, args);
    }

}
