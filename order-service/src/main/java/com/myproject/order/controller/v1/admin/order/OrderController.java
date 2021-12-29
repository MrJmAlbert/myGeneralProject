package com.myproject.order.controller.v1.admin.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhe.liu
 */
@RestController
@RequestMapping("/v1/admin/order")
public class OrderController {

    @GetMapping("/consume1")
    public String consume1(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "success";
    }


    @GetMapping("/consume2")
    public String consume2(){
        return "success";
    }


}
