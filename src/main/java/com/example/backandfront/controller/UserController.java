package com.example.backandfront.controller;


import com.example.backandfront.model.User;
import com.example.backandfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public ResponseEntity<User> addUsers(@RequestBody User user){
       User registeredUser = userService.addUser(user);
       return ResponseEntity.ok(registeredUser);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> Users = userService.getAllStudents();

    }
}
