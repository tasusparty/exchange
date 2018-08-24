package com.tasusparty.exchange.rest;

import com.tasusparty.exchange.facade.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    private final static String SUCCESS = "SUCCESS";

    @RequestMapping("/sign-up")
    public String signUp(String phoneNo, String name, String password) {
        userInfoService.signUp(phoneNo, name, password);
        return SUCCESS;
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to exchange community!";
    }
}
