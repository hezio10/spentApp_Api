package com.example.spentapp.modules.user.dtos;

public record UserRequest(
        String name,
        String password,
        Integer role_id
) {}
