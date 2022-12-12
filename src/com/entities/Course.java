package com.entities;

public class Course extends BaseEntity {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Course(String name, double price) {

        this.name = name;
        this.price = price;
    }
}
