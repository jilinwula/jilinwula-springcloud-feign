package com.jilinwula.feign.controller;

import com.jilinwula.feign.server.ServerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Controller {

    @Autowired
    private ServerApi serverApi;

    @GetMapping("/get")
    public Object get() {
        String result = serverApi.get();
        return result;
    }
}
