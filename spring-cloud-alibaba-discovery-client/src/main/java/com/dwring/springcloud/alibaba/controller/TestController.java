package com.dwring.springcloud.alibaba.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class TestController {


    @Autowired
    private LoadBalancerClient client;


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = client.choose("alibaba-nacos-discovery-server");
        String url = serviceInstance.getUri() + "/producer?name=zhanghaichang";
        log.info("url: {}",url);
        String response = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + response;
    }

}
