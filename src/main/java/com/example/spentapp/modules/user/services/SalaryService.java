package com.example.spentapp.modules.user.services;

import com.example.spentapp.modules.user.dtos.SalaryRequest;
import com.example.spentapp.modules.user.enities.Salary;
import com.example.spentapp.modules.user.enities.User;
import com.example.spentapp.modules.user.repositories.SalaryRepository;
import com.example.spentapp.modules.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    private final SalaryRepository salaryRepository;
    private final UserRepository userRepository;

    public SalaryService(SalaryRepository salaryRepository, UserRepository userRepository) {
        this.salaryRepository = salaryRepository;
        this.userRepository = userRepository;
    }

    public List<Salary> getUserSalaries(Integer id) {
        return  salaryRepository.findByUserId(id);
    }

    public Salary registerUserSalary(Integer id, SalaryRequest request) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Utilizador não encontrado: " + id));

        Salary salary = new Salary();
        salary.setAmount(request.amount());
        salary.setCurrency(request.currency());
        salary.setIsActive(request.is_active());
        salary.setUser(user);

        return  salaryRepository.save(salary);
    }
}
