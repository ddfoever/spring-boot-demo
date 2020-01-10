package com.allen.controller;

import com.allen.pojo.User;
import com.allen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String test(){
        return "hello spring boot!";
    }

    private String sql = "SELECT name FROM t_user WHERE id = ?";

    @Autowired
    private UserService userServiceImpl;


    @GetMapping("/user/{id}")
    public String testBD(@PathVariable(value = "id") Integer id){
//        String name = jdbcTemplate.queryForObject(sql,new Integer[]{id},String.class);

        String name = userServiceImpl.findById(id);
        return "hello " + name;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userServiceImpl.findAll();
    }



}
