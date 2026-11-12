package com.example.spentapp.modules.user.dtos;

public record SalaryRequest(
        double amount,
        String currency,
        Integer is_active
) {}
