package com.myproject.iam.controller.v1.admin;


import cn.itcast.log.MyLog;
import cn.itcast.service.HelloService;
import com.myproject.iam.service.user.batis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhe.liu
 */


@RestController
@RequestMapping(value = "/v1/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HelloService helloService;


    @GetMapping("/test")
    void testResponse(){

    }

    @MyLog(desc = "sayHello方法") //日志记录注解
    @GetMapping("/say")
    public String sayHello(){
        return helloService.sayHello();
    }

}
