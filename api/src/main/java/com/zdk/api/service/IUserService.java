package com.zdk.api.service;

import com.zdk.api.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("provider-servera")
public interface IUserService {

    @GetMapping("/findAll")
    List<User> findAll();
}
