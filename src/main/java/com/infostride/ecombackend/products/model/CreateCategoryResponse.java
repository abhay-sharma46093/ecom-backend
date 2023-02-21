package com.infostride.ecombackend.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryResponse {
    private Category category;
    private String message;
    private Integer code;

}
