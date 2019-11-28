package com.yang.web.service;

import com.yang.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestServiceTest {

    @Autowired
    private FirstService firstService;

    @org.junit.Test
    public void createRecord(){
        List<User> userList = firstService.findUser();
        for (User users: userList
             ) {
            System.out.println(users);;
        }
    }
}
