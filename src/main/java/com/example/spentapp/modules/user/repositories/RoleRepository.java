package com.example.spentapp.modules.user.repositories;

import com.example.spentapp.modules.user.enities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
