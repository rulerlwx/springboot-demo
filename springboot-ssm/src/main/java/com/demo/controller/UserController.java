package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lwx on 2019/5/5.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findUserByName")
    public List<User> findUserByName(String name){
        return userService.findUserByName(name);
    }
}
