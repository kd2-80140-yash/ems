package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeemanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
