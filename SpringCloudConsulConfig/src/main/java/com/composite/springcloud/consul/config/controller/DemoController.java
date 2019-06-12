package com.composite.springcloud.consul.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${first.name}")
    private String firstName;

    @GetMapping("/firstName")
    public String firstName() {
        return firstName;
    }
}
