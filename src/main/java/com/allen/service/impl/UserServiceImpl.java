package com.allen.service.impl;

import com.allen.mapper.UserMapper;
import com.allen.service.UserService;
import com.allen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public String findById(int id) {
        return userMapper.findById(id);
    }
}
