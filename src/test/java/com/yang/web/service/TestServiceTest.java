package com.yang.web.service;

import com.yang.web.config.WebMvcConfig;
import com.yang.web.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebMvcConfig.class})
public class TestServiceTest {

    @Autowired
    private FirstService firstService;

    @Test
    public void testUser() {
        assertEquals("123456",firstService.findUserByID(1));
    }
}