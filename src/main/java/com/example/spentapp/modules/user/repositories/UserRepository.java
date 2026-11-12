package com.example.spentapp.modules.user.repositories;

import com.example.spentapp.modules.user.enities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
