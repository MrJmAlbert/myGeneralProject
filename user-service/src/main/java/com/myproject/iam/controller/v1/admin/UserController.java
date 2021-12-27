package com.myproject.iam.controller.v1.admin;

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

    @GetMapping("/test")
    void testResponse(){

    }

}
