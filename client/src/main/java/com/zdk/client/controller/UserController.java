package com.zdk.client.controller;

import com.zdk.api.domain.User;
import com.zdk.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @Value("${name}")
    private String name;

    @GetMapping("/findAll")
    public List<User> findAll(){

        System.out.println(name);
       return  userService.findAll();
    }

}
