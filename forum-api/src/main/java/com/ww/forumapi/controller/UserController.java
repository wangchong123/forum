package com.ww.forumapi.controller;

import com.ww.forumapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String login(){
        return userService.get();
    }

    @RequestMapping("/register")
    public Map register(){
        Map<String,Object> map = new HashMap<>();
        map.put("status",0);
        return map;
    }
}
