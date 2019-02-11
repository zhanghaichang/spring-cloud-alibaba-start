package com.dwring.springcloud.alibaba.controller;

import com.dwring.springcloud.alibaba.feign.IFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {


    @Autowired
    private IFeignClient iFeignClient;

    @GetMapping("/feign")
    public String feign() {
        return iFeignClient.feign("zhanghaichang-feign");
    }
}
