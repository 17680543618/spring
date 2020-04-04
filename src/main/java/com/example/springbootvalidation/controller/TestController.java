package com.example.springbootvalidation.controller;

import com.example.springbootvalidation.model.Test;
import com.example.springbootvalidation.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class TestController{
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @RequestMapping("test")
    public String toAdd(Test test) {
        return "test";
    }

    @RequestMapping("addTest")
    public String add(@Valid Test test, BindingResult result) {
        if (result.hasErrors()) {
            return "test";
        }
        logger.info("保存用户 =" + test.getName());
        return "success";
    }
}