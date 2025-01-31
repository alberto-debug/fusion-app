package com.example.backandfront.service;

import com.example.backandfront.model.User;
import com.example.backandfront.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllStudents(){
        return userRepository.findAll();
    }

    public Optional<User> getStudentById(Long id){
        return userRepository.findById(id);
    }
}
