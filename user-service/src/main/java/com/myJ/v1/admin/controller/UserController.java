package com.myJ.v1.admin.controller;

import com.myJ.service.user.batis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhe.liu
 */


@RestController
@RequestMapping(value = "/v1/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

}
