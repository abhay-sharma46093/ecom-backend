package com.infostride.ecombackend.products.service;

import com.infostride.ecombackend.products.model.Category;
import com.infostride.ecombackend.products.model.CreateCategoryResponse;
import com.infostride.ecombackend.products.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CreateCategoryResponse createCategory(Category category) {
        categoryRepository.save(category);
        CreateCategoryResponse response = new CreateCategoryResponse();

        response.setCategory(category);
        response.setMessage("Category created successfully");
        response.setCode(200);

        return response;
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Boolean deleteCategory(Category category, Integer catId) {
        var cat = categoryRepository.findById(catId).get();
        System.out.println("cat"+cat.getName());
        if (cat == null) {
            return false;
        }
        categoryRepository.delete(cat);
        return true;
    }

}
