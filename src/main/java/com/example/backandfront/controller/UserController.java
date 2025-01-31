package com.example.backandfront.controller;


import com.example.backandfront.model.User;
import com.example.backandfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> addUsers(@RequestBody User user){
       User registeredUser = userService.addUser(user);

        System.out.println("User "+ registeredUser.getName()+ " Registered");

       return ResponseEntity.ok(registeredUser);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> Users = userService.getAllStudents();
        if (Users.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(Users);
    }
}
