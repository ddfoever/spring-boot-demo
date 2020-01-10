package com.allen.mapper;

import com.allen.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> findAll();

    String findById(int id);
}
