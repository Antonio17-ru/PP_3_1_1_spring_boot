package com.example.pp_3_1_1_spring_boot.service;

import com.example.pp_3_1_1_spring_boot.model.User;


import java.util.List;

public interface UserService {

    User findById(int id);


    List<User> findAll();

    User saveUser(User user);

    void deleteById(int id);
}
