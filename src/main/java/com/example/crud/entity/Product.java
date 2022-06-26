package com.example.crud.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table (name = "product_tbl")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
}
