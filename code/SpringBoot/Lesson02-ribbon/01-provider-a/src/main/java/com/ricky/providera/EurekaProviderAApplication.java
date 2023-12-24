package com.ricky.providera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZQQ
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaProviderAApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderAApplication.class, args);
    }

}
