package com.example.spentapp.modules.user.repositories;

import com.example.spentapp.modules.user.enities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {
    List<Salary> findByUserId(Integer id);
}
