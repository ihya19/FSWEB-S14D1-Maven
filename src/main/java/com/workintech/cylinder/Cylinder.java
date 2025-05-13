package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public Double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
