package com.infostride.ecombackend.products.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private Integer product_id;

    private String name;

    private String catId;

    private String price;

    private Integer qty;


    private List<Category> category;

}
