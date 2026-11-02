package com.example.spentapp.modules.product.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false, precision = 10)
    private double unitPrice;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false, precision = 10)
    private double totalAmount;

//    @Column(nullable = false)
//    private String currency;
}
