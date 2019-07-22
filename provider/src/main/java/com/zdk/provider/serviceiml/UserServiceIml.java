package com.zdk.provider.serviceiml;

import com.zdk.api.domain.User;
import com.zdk.api.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserServiceIml implements IUserService {
    @Override
    public List<User> findAll(@RequestParam(value = "name") String name) {
        List<User> list = new ArrayList<>();
        list.add(new User("1",name));
        list.add(new User("2",name));
        list.add(new User("3","c"));
        list.add(new User("4","d"));
        return list;
    }
}
