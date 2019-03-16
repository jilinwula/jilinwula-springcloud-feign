package com.jilinwula.feign.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jilinwula-springcloud-feign-server")
public interface ServerApi {

    @GetMapping("/server/get")
    String get();
}
