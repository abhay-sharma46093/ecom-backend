package com.infostride.ecombackend.products.controller;

import com.infostride.ecombackend.products.model.CreateProductResponse;
import com.infostride.ecombackend.products.model.Product;
import com.infostride.ecombackend.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductsController {


    private final ProductService productService;


    //create product
    @PostMapping("/create")
    private ResponseEntity<CreateProductResponse> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.createProduct(product));
    }

    @GetMapping("/all")
    private ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getProductById(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable Integer id) {
        return ResponseEntity.ok(productService.updateProduct(product,id));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deleteProduct(@RequestBody Product product, @PathVariable Integer id) {
        return ResponseEntity.ok(productService.deleteProduct(product, id));
    }


}
