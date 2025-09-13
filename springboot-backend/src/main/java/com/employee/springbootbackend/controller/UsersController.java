package com.employee.springbootbackend.controller;

import com.employee.springbootbackend.entity.Users;
import com.employee.springbootbackend.repository.UsersRepo;
import com.employee.springbootbackend.requests.LoginRequest;
import com.employee.springbootbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }

    @PostMapping("/loginUser")
    public Boolean loginUser(@RequestBody LoginRequest loginRequset) {
        return  userService.loginUser(loginRequset);
    }
}
