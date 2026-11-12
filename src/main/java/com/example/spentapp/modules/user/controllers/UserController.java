package com.example.spentapp.modules.user.controllers;

import com.example.spentapp.modules.user.dtos.SalaryRequest;
import com.example.spentapp.modules.user.dtos.UserRequest;
import com.example.spentapp.modules.user.enities.Salary;
import com.example.spentapp.modules.user.enities.User;
import com.example.spentapp.modules.user.services.SalaryService;
import com.example.spentapp.modules.user.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final SalaryService salaryService;

    public UserController (UserService userService, SalaryService salaryService) {
        this.userService = userService;
        this.salaryService = salaryService;
    }

    @PostMapping
    public  ResponseEntity<User> register(@RequestBody UserRequest request) {
       return ResponseEntity.status(HttpStatus.CREATED).body(userService.register(request));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getById(@PathVariable Integer id) {
        Optional<User>  user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/{id}/salaries")
    public ResponseEntity<Salary> getUserSalaries(@PathVariable Integer id, @RequestBody SalaryRequest request) {
        Salary  salary = salaryService.registerUserSalary(id, request);
        return ResponseEntity.ok(salary);
    }

    @GetMapping("/{id}/salaries")
    public ResponseEntity<List<Salary>> getUserSalaries(@PathVariable Integer id) {
        List<Salary>  user = salaryService.getUserSalaries(id);
        return ResponseEntity.ok(user);
    }
}
