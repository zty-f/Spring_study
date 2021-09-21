package com.zty.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@Data
public class People {
    //@Autowired
    @Resource
    private Cat cat;
    @Qualifier(value="dog222")
    @Autowired
    private Dog dog;
    private String name;
}
