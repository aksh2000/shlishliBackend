package com.shlishli.category.controller;

import java.util.List;

import com.shlishli.category.entity.Category;
import com.shlishli.category.service.CategoryService;
import com.shlishli.category.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Category addCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping(value = IConstants.ALL_CATEGORIES)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
