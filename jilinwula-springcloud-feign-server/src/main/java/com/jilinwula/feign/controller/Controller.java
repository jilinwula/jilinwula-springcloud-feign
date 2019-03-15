package com.jilinwula.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/server")
public class Controller {

    @GetMapping("/get")
    public Object get() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", "0");
        map.put("msg", "success");
        map.put("data", "吉林乌拉");
        return map;
    }
}
