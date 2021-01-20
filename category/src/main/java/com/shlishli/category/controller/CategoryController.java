package com.shlishli.category.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shlishli.category.entity.Category;
import com.shlishli.category.service.CategoryService;
import com.shlishli.category.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(IConstants.CATEGORIES)
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(IConstants.ADD_CATEGORY)
    public Category addCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping(value = IConstants.ALL_CATEGORIES)
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping(value = IConstants.GET_CATEGORY_DETAILS)
    public Optional<Category> findById(@PathVariable("categoryId") Long categoryId) {
        return categoryService.findById(categoryId);
    }

    @PostMapping(value = "/addMultipleCategories")
    public List<Category> addMultipleCategories(@RequestBody List<Category> categories){
        List<Category> addedCategories = new ArrayList<>();
        for (Category category:categories) {
            Category category1 = categoryService.saveCategory(category);
            addedCategories.add(category1);
        }
        return addedCategories;
    }
}
