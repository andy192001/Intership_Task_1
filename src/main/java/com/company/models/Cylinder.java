package com.company.models;

public class Cylinder implements Figure {

    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Area=" + calculateArea() +
                '}';
    }
}
