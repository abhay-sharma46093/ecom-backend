package com.infostride.ecombackend.products.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {

    @PostMapping("/add")
    private ResponseEntity<String> addCategory(){
        return ResponseEntity.ok("");
    }

    @GetMapping("/all")
    private ResponseEntity<String> getAllCategories(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/delete")
    private ResponseEntity<String> deleteCategory(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/update")
    private ResponseEntity<String> updateCategory(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/{id}")
    private ResponseEntity<String> getCategoryById(){
        return ResponseEntity.ok("");
    }
}
