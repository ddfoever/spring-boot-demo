package com.allen.service;

import com.allen.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    String findById(int id);
}
