package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeemanagementsystem.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
