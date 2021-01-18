package com.shlishli.category.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shlishli.category.entity.Category;
import com.shlishli.category.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> getAllCategories() {
		Iterable<Category> categoryIterable = categoryRepository.findAll();
		List<Category> categoryList = new ArrayList<>();
		categoryIterable.forEach(categoryList::add);
		return categoryList;
	}

	public Optional<Category> findById(Long categoryId) {
		return categoryRepository.findById(categoryId);
	}
    
}
