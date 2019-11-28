package com.yang.web.controller;

import com.yang.web.pojo.Record;
import com.yang.web.service.Test;
import com.yang.web.service.TestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Test test;

    @Autowired
    private Record record;

    @RequestMapping(value = "/test")
    public void Demo(){
        record = test.createRecord();
        System.out.println(record);
    }
}
