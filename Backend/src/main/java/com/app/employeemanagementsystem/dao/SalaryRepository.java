package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.employeemanagementsystem.entity.Salary;
import com.app.employeemanagementsystem.entity.User;

import java.util.List;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
    List<Salary> findByUser(User user);
}
