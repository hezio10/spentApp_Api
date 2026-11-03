package com.example.spentapp.modules.product.entities;

import com.example.spentapp.modules.user.enities.User;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;

import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String productName;

    @Column(nullable = true, length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "product")
    private  List<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product")
    private List<Transaction> transactions;
}
