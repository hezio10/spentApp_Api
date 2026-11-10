package com.example.spentapp.modules.user.services;

import com.example.spentapp.modules.user.enities.User;
import com.example.spentapp.modules.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public  Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }
}
