package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CategoryService {
    // interface promotes loose coupling and modularity
    List<Category> getAllCategories();

    void createCategory(Category category);
}
