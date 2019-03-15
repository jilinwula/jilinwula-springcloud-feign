package com.jilinwula.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class Controller {

    @Autowired
    private RestTemplate template;

    @GetMapping("/get")
    public Object get() {
        String result = template.getForObject("http://127.0.0.1:8082/server/get", String.class);
        return result;
    }
}
