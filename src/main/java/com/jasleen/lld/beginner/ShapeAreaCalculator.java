package com.jasleen.lld.beginner;

public class ShapeAreaCalculator {

    public double calculateArea(String shape, double... dimensions) {
        if (shape == null) {
            throw new IllegalArgumentException("Shape cannot be null");
        } else if (shape.equals("Circle")) {
            if (dimensions.length != 1) {
                throw new IllegalArgumentException("Circle requires exactly 1 dimension (radius)");
            }
            Circle circle = new Circle();
            circle.setRadius(dimensions[0]);
            return circle.getShapeArea();
        } else if (shape.equals("Square")) {
            if (dimensions.length != 1) {
                throw new IllegalArgumentException("Square requires exactly 1 dimension (side)");
            }
            Square square = new Square();
            square.setSide(dimensions[0]);
            return square.getShapeArea();
        } else if (shape.equals("Rectangle")) {
            if (dimensions.length != 2) {
                throw new IllegalArgumentException("Rectangle requires exactly 2 dimensions (length and breadth)");
            }
            Rectangle rectangle = new Rectangle();
            rectangle.setLength(dimensions[0]);
            rectangle.setBreadth(dimensions[1]);
            return rectangle.getShapeArea();
        } else {
            throw new IllegalArgumentException("Unsupported shape: " + shape);
        }
    }
}

//--- Shape Implementations ---

interface Shape {
    double getShapeArea();
}

class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getShapeArea() {
        return radius * radius * Math.PI;
    }
}

class Square implements Shape {
    private double side;

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getShapeArea() {
        return side * side;
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double getShapeArea() {
        return length * breadth;
    }
}
