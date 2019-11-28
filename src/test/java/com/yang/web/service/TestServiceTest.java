package com.yang.web.service;

import com.yang.web.config.WebMvcConfig;
import com.yang.web.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration(classes = WebMvcConfig.class)
public class TestServiceTest {

    @Autowired
    private FirstService firstService;

    @Test
    public void createRecord(){
        List<User> userList = firstService.findUser();
        for (User users: userList
             ) {
            System.out.println(users);;
        }
    }
}
