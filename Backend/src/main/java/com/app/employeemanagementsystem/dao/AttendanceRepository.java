package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.employeemanagementsystem.entity.Attendance;
import com.app.employeemanagementsystem.entity.User;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByUser(User user);
}
