package com.ww.forumservice.api;

import com.ww.forumcommon.util.Result;
import com.ww.forumservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public Result getUser(){
        userService.get();
        return new Result();
    }
}
