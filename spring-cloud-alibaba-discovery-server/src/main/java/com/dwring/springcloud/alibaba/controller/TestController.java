package com.dwring.springcloud.alibaba.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {


    @RequestMapping(value = "/producer", method = RequestMethod.GET)
    public String producer(@RequestParam String name) {
        log.info("invoked name =" + name);
        return "hello, " + name;
    }

}
