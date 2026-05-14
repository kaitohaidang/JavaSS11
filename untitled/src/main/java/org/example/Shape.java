package org.example;

public abstract class Shape {
    public String name;
    public Shape(String name) {
        this.name=name;
    }
    public abstract double getArea();
    public abstract double  getPerimeter();
    public void disInfo() {
        System.out.println("Ten Hinh"+name);
    }
}
