package com.dwring.springcloud.alibaba.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("alibaba-nacos-discovery-server")
public interface IFeignClient {

    @GetMapping("/producer")
    String feign(@RequestParam(name = "name") String name);
}
