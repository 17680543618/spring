package com.example.springbootvalidation.controller;

import com.example.springbootvalidation.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @RequestMapping("add")
    public String toAdd(User user) {
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
       logger.info("保存用户 =" + user.getName());
        return "success";
    }
}
