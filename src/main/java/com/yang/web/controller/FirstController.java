package com.yang.web.controller;

import com.yang.web.pojo.User;
import com.yang.web.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    private FirstService firstService;

    @RequestMapping(value = "/first")
    public ModelAndView firstTest() {
        List<User> userList = firstService.findUser();

//        for (User user: userList) {
//            System.out.println(user);
//        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("/userList");
        return modelAndView;
    }
}
