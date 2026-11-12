package com.example.spentapp.modules.user.services;

import com.example.spentapp.modules.user.dtos.UserRequest;
import com.example.spentapp.modules.user.enities.Role;
import com.example.spentapp.modules.user.enities.User;
import com.example.spentapp.modules.user.repositories.RoleRepository;
import com.example.spentapp.modules.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService (UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public  Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public  User register(UserRequest request) {

        Role role = roleRepository.findById(request.role_id())
                .orElseThrow(() -> new RuntimeException("Role não encontrada: " + request.role_id()));

        User user = new User();
        user.setName(request.name());
        user.setPassword(request.password());
        user.setRole(role);

        User saved = userRepository.save(user);
        return saved;
    }
}
