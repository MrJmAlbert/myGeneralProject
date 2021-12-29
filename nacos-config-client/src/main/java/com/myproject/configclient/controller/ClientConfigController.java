package com.myproject.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhe.liu
 */

@RefreshScope
@RestController
public class ClientConfigController {

    @Value("${payment.info}")
    private String paymentInfo;

    @GetMapping("/payment/info")
    public String testMent(){
        return paymentInfo;
    }
}
