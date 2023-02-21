package com.infostride.ecombackend.products.service;

import com.infostride.ecombackend.products.model.CreateProductResponse;
import com.infostride.ecombackend.products.model.Product;
import com.infostride.ecombackend.products.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductsRepository productsRepository;


    // create product
    public CreateProductResponse createProduct(Product product) {

        productsRepository.save(product);
        CreateProductResponse response = new CreateProductResponse();
        response.setProduct(product);
        response.setMessage("Product created successfully!");
        response.setCode(200);

        return response;
    }


    //get all products
    public List<Product> getAllProducts(){
        return productsRepository.findAll();
    }


}
