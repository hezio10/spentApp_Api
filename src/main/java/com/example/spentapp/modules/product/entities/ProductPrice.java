package com.example.spentapp.modules.product.entities;

import com.example.spentapp.modules.user.enities.User;
import jakarta.persistence.*;

@Entity
@Table(name = "product_prices")
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, precision = 10)
    private double price;

    @Column(nullable = false)
    private Integer isActive;

    @Column(nullable = false)
    private String expirationDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}