package com.bckj.stat;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatController {

    @PostMapping("statAddUser")
    public Object statAddUser(String name) {
        return "success add user: " + name;
    }
}
