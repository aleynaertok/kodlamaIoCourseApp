package com;


import com.business.CategoryManager;
import com.business.CourseManager;
import com.core.FileLogger;
import com.core.Logger;
import com.core.MailLogger;
import com.dataAccess.HibernateCourseDao;
import com.dataAccess.JdbcCategoryDao;
import com.entities.Category;
import com.entities.Course;
import com.entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       Course course = new Course("Java",1500);
       Course course1 = new Course("PHP",1200);

       List<Course> courses = new ArrayList<>();
       courses.add(course);
       courses.add(course1);
       List<Logger> loggers = new ArrayList<>();
       loggers.add(new FileLogger());
       loggers.add(new MailLogger());

        CourseManager courseManager = new CourseManager(courses,loggers,new HibernateCourseDao());

        Course course2 = new Course("C",-1);
        courseManager.add(course2);

        Category category = new Category("Öğretmenler");
        List<Category> categories = new ArrayList<>();
        categories.add(category);
        Category category1 = new Category("Öğretmenler");

        CategoryManager categoryManager = new CategoryManager(categories,loggers, new JdbcCategoryDao());
        categoryManager.add(category);

        for (Category category2:categories){
            System.out.println(category2.getName());
        }
    }




}
