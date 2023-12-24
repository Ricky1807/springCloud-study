package com.ricky.eurekaclienta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: qqzhu.ricky
 * @createDate:
 * @version: 1.0
 */
@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String doDiscovery(String serviceName) {
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);
        instances.forEach(System.out::println);

        ServiceInstance serviceInstance = instances.get(0);
        int port = serviceInstance.getPort();
        String host = serviceInstance.getHost();
        System.out.println(host + ":" + port);
        return serviceInstance.getServiceId();
    }


}
