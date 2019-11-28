package com.yang.web.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Record {
    private Integer recordId;

    private Date time;

    private Integer userId;

    private Integer requirementId;

}