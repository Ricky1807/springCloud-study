package com.ricky.providera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: qqzhu.ricky
 * @createDate:
 * @version: 1.0
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello(){
        return "I'm provider A!";
    }
}
