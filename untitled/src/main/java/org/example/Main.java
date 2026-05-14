package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[2];
        shapes[0]= new Rectangle("Hinh chu nhat",1,2);
        shapes[1]= new Circle("hinh tron",3);
        for (Shape s :shapes) {
            s.disInfo();
            System.out.println("dien tich"+s.getArea());
            System.out.println("chu vi" +s.getPerimeter());
        }
    }
}