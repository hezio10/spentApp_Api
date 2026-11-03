package com.example.spentapp.modules.user.enities;

import jakarta.persistence.*;

@Entity
@Table(name = "salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, precision = 10)
    private double amount;

    @Column(nullable = false)
    private Integer isActive;

    @Column(nullable = false)
    private String currency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
