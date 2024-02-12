package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeemanagementsystem.entity.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
