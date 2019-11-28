package com.yang.web.service;

import com.yang.web.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TestImpl implements Test {

    @Autowired
    private Record record;

    @Override
    public Record createRecord() {
        Date date = new Date();
        date.getTime();
        record.setRecordId(1);
        record.setUserId(2);
        record.setTime(date);
        record.setRequirementId(3);
        return record;
    }
}
