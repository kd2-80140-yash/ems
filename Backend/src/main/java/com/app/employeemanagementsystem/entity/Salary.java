package com.app.employeemanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long houseRentAllowance;
    private Long fixedAmount;
    private Long providentFund;
    private Long professionalTax;
    private Long incomeTax;
    private Long specialAllowance;
    private LocalDate dateOfPayment;
    private String month;
    private Long year;
    private Boolean paid = false;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
