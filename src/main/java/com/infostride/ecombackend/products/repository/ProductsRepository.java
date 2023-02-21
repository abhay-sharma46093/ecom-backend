package com.infostride.ecombackend.products.repository;

import com.infostride.ecombackend.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
