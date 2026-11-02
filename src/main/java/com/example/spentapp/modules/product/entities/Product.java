package com.example.spentapp.modules.product.entities;

import jakarta.persistence.*;

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
}
