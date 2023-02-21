package com.infostride.ecombackend.products.service;

import com.infostride.ecombackend.products.model.Category;
import com.infostride.ecombackend.products.model.CreateCategoryResponse;
import com.infostride.ecombackend.products.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    private CreateCategoryResponse createCategory(Category category){
        categoryRepository.save(category);
        CreateCategoryResponse response = new CreateCategoryResponse();

        response.setCategory(category);
        response.setMessage("Category created successfully");
        response.setCode(200);

        return response;
    }

}
