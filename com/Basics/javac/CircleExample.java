package com.Basics.javac;
class Circle {
    //Data members/instance variables
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
        System.out.println(color + " " + radius);
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleExample {

    public static void main(String[] args) {

        Circle circle = new Circle(13.7);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        System.out.println("==========================");

        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println();
    }
}
