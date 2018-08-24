package com.tasusparty.exchange.dal.mapper;

import com.tasusparty.exchange.facade.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    void insertUser(User user);
}
