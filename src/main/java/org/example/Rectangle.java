package org.example;

public class Rectangle extends Shape{

    private double length = 4.0;
    private double width = 6.0;

    @Override
    public double area() {
        return length * width;
    }
}
