package com.zdk.api.service;

import com.zdk.api.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider-server",fallback = UserServiceException.class)
public interface IUserService {

    @GetMapping("/findAll")
    List<User> findAll(@RequestParam(value = "name")String name);
}
