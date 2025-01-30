package com.example.backandfront.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class User {

    @Id
    private String id;
    private String name;
    private int age;


}
