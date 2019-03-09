package com.jilinwula.jilinwulaspringcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JilinwulaSpringcloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(JilinwulaSpringcloudEurekaClientApplication.class, args);
    }

}
