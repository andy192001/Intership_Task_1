package com.company.models;

public class Cube implements Figure{

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "Area=" + calculateArea() +
                '}';
    }
}
