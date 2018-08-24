package com.tasusparty.exchange.biz;

import com.tasusparty.exchange.dal.mapper.UserInfoMapper;
import com.tasusparty.exchange.facade.model.User;
import com.tasusparty.exchange.facade.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void signUp(String phoneNo, String name, String password) {
        // todo add aop for validation
        userInfoMapper.insertUser(new User(phoneNo, name, password));
    }
}
