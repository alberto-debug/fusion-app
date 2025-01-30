package com.example.backandfront.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.swing.*;

@Entity
@Table(name = "test")
public class User {

    @Id
    private String id;
    private String name;
    private int age;

    public User(){

    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

}
