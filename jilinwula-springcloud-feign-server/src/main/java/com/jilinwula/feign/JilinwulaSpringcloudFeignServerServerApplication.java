package com.jilinwula.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JilinwulaSpringcloudFeignServerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JilinwulaSpringcloudFeignServerServerApplication.class, args);
	}

}
