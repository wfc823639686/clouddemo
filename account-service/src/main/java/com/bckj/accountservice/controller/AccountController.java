package com.bckj.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("register")
    public Object register(String name) {
        System.out.println(name);
        return "register";
    }
}
