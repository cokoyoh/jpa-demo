package com.jpa.example.jpademo.services;

import com.jpa.example.jpademo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
