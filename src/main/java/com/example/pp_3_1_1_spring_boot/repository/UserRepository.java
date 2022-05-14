package com.example.pp_3_1_1_spring_boot.repository;


import com.example.pp_3_1_1_spring_boot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
}
