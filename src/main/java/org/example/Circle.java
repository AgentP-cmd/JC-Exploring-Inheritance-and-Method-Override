package org.example;

public class Circle extends Shape{
    private double radius = 5.0;

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
