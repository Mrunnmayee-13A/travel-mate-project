package com.travel.mate.project.controller;

import com.travel.mate.project.model.User;
import com.travel.mate.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/insert")
    public List<User> createUser(@RequestBody List<User> userList){
        return userService.createUser(userList);
    }
}
