package com.infostride.ecombackend.products.controller;

import com.infostride.ecombackend.products.model.Category;
import com.infostride.ecombackend.products.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/add")
    private ResponseEntity<?> addCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.createCategory(category));

    }

    @GetMapping("/all")
    private ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @PostMapping("/delete/{id}")
    private ResponseEntity<?> deleteCategory(@RequestBody Category category, @PathVariable Integer id) {
        return ResponseEntity.ok(categoryService.deleteCategory(category, id));
    }

    @PostMapping("/update")
    private ResponseEntity<String> updateCategory() {
        return ResponseEntity.ok("");
    }

    @PostMapping("/{id}")
    private ResponseEntity<String> getCategoryById() {
        return ResponseEntity.ok("");
    }
}
