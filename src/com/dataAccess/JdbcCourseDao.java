package com.dataAccess;

public class JdbcCourseDao implements CourseDao{
    public void add(){
        System.out.println("Kurs JDBC ile eklendi");
    }
}
