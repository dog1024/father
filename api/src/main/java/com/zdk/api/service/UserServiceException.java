package com.zdk.api.service;

import com.zdk.api.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class UserServiceException implements IUserService{
    @Override
    public List<User> findAll(String name) {
        List<User> list = new ArrayList<>();
        list.add(new User("1111111","aaaaaaaaaa"));
        return list;
    }
}
