package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.employeemanagementsystem.entity.LeaveRequest;
import com.app.employeemanagementsystem.entity.User;

import java.util.List;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    List<LeaveRequest> findByUser(User user);
}
