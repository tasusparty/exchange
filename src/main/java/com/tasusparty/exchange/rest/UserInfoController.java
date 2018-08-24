package com.tasusparty.exchange.rest;

import com.tasusparty.exchange.facade.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    private final static String SUCCESS = "SUCCESS";

    @RequestMapping("/sign-up")
    public @ResponseBody String signUp(String phoneNo, String name, String password) {
        userInfoService.signUp(phoneNo, name, password);
        return SUCCESS;
    }
}
