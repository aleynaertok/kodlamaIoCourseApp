package com.dataAccess;

public class JdbcCategoryDao implements CategoryDao {
    public void add(){
        System.out.println("Kategori JDBC ile eklendi");
    }
}
