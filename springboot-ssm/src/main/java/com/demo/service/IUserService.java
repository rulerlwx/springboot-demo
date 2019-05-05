package com.demo.service;

import com.demo.domain.User;

import java.util.List;

/**
 * Created by lwx on 2019/5/5.
 */
public interface IUserService {
    List<User> findAllUser();
    List<User> findUserByName(String name);
}
