package com.app.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeemanagementsystem.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
}
