package com.tasusparty.exchange;

import com.tasusparty.exchange.dal.mapper.UserInfoMapper;
import com.tasusparty.exchange.facade.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    @Transactional
    @Rollback
    public void userInfoTest() {
        userInfoMapper.insertUser(new User("test", "test", "test"));
    }
}
