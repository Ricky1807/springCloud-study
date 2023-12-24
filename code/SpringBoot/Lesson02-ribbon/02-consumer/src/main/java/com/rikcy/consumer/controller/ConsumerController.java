package com.rikcy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: qqzhu.ricky
 * @createDate:
 * @version: 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testRibbon")
    public String test(String serviceName){
        String url = "http://" + serviceName + "/hello";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("result = " + result);
        return result;
    }
}
