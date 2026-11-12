package com.example.spentapp.modules.user.controller;

import com.example.spentapp.modules.user.dtos.UserRequest;
import com.example.spentapp.modules.user.enities.User;
import com.example.spentapp.modules.user.repositories.UserRepository;
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

    public UserController (UserService userService) {
        this.userService = userService;
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
    public ResponseEntity<Optional<User>> getById(@PathVariable Long id) {
        Optional<User>  user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }
}
