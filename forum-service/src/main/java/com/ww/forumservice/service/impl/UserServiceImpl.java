package com.ww.forumservice.service.impl;

import com.ww.forumservice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String get() {
        return "名字";
    }
}
