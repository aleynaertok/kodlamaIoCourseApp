package com.business;

import com.core.Logger;
import com.dataAccess.CategoryDao;
import com.entities.Category;


import java.util.List;

public class CategoryManager {
        private final List<Category> categories;
        private final List<Logger> loggers;
        private final CategoryDao categoryDao;

    public CategoryManager(List<Category> categories, List<Logger> loggers, CategoryDao categoryDao) {
        this.categories = categories;
        this.loggers = loggers;
        this.categoryDao = categoryDao;
    }

    public void add(Category category){
        for(Category category1: categories){
            if(category1.getName().equals(category.getName())){

            }

        }
        categories.add(category);
        categoryDao.add();
    }
}
