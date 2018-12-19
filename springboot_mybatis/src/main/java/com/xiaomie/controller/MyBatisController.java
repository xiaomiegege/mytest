package com.xiaomie.controller;

import com.xiaomie.domain.User;

import com.xiaomie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class MyBatisController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User>queryUserList(){
        List<User>users=mapper.queryUserList();
        return users;

    }
}
