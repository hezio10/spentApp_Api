package com.example.spentapp.modules.user.enities;

import com.example.spentapp.modules.product.entities.Category;
import com.example.spentapp.modules.product.entities.Product;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String password;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role Role;

    @OneToMany(mappedBy = "user")
    private List<Salary> salaries;

    @OneToMany(mappedBy = "user")
    private List<Category> categories;

    @OneToMany(mappedBy = "user")
    private List<Product> products;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;
}
