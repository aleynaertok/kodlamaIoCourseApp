package com.business;

import com.core.Logger;
import com.dataAccess.CourseDao;
import com.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
   private final List<Course> courses;
   private final List<Logger> loggers;
   private final CourseDao courseDao;

    public CourseManager(List<Course> courses, List<Logger> loggers, CourseDao courseDao) {
        this.courses = courses;
        this.loggers = loggers;
        this.courseDao = courseDao;
    }

    public void add(Course course){
   for (Course course1:courses){
       if (course1.getName().equals(course.getName())){
           System.out.println("Kurs isimleri tekrar edemez");
       }

   }
        if(course.getPrice()<0){
            System.out.println("Kurs fiyatı 0dan küçük olamaz");
        }

        courses.add(course);
        courseDao.add();

        for(Logger logger : loggers){
            logger.hi();
        }
    }
}
