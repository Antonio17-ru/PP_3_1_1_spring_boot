package com.example.pp_3_1_1_spring_boot.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "last_name")
    private String lastName;

    private int age;

}
