package com.demo.service.impl;

import com.demo.dao.IUserMapper;
import com.demo.domain.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwx on 2019/5/5.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public List<User> findUserByName(String name) {
        return userMapper.findUserByName(name);
    }
}
