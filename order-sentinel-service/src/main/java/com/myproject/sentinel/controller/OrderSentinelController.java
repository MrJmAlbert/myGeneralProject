package com.myproject.sentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhe.liu
 */
@RestController
@Slf4j
public class OrderSentinelController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()  {
        return "------testB";
    }

}
