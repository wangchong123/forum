package com.ww.forumapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "forum-service",fallback = UserServiceHy.class)
public interface UserService {

    @RequestMapping("/getUser")
    String get();
}
