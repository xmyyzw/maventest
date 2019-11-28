package com.yang.web.service;

import com.yang.web.mapper.UserMapper;
import com.yang.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUser(){
        return userMapper.selectByExampleWithBLOBs(null);
    }
}
