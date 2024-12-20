package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

public interface CategoryService {
    // interface promotes loose coupling and modularity
    List<Category> getAllCategories();

    void createCategory(Category category);

    String updateCategory(Long id, Category category);

    String deleteCategory(Long id);

//    Category getCategoryById(int id);

}
