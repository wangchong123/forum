package com.ww.forumapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ForumApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumApiApplication.class, args);
    }

}
