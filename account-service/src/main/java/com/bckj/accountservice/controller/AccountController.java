package com.bckj.accountservice.controller;

import com.bckj.accountservice.client.StatServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    StatServiceClient statServiceClient;

    @GetMapping("register")
    public Object register(String name) {
        System.out.println(name);
        return statServiceClient.statAddUser(name);
    }
}
