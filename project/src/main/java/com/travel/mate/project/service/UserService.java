package com.travel.mate.project.service;

import com.travel.mate.project.model.User;
import com.travel.mate.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> createUser(List<User> userList) {
        return userRepository.saveAll(userList);
    }


}
