package org.example;

public class Rectangle extends Shape implements Drawble{
    private double cd;
    private double cr;

    public Rectangle(String name, double cd , double cr ) {
        super(name);
        this.cd=cd;
        this.cr=cr;
    }
    @Override
    public double getArea() {
        return cd*cr;
    }

    @Override
    public double getPerimeter() {
        return (cd+cr)*2;
    }
    @Override
    public void draw() {
        System.out.println("da ve hinh" +name);
    }
}
