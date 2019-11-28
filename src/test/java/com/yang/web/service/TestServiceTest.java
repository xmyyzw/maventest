package com.yang.web.service;

import com.yang.web.config.WebMvcConfig;
import com.yang.web.pojo.User;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebMvcConfig.class})
public class TestServiceTest {

    @Autowired
    private FirstService firstService;

    @Test
//    @DisplayName("User")
    public void testUser() {
        List<User> userList = firstService.findUser();
        for (User users : userList) {
            System.out.println(users);
        }
    }
}