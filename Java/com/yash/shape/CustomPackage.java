package com.yash.shape;

abstract class Shape {
    abstract double calculateArea();

}

// Base class
class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println(" Radius cannot be Negative. ");
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Length cannot be Negative.");
        }
    }

    public void setBreadth(int breadth) {
        if (breadth >= 0) {
            this.breadth = breadth;
        } else {
            System.out.println("Breadth caannot be Negative.");
        }
    }

    public double calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public double calculateDiagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }
}

// Square class
class Square extends Rectangle {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side >= 0) {
            this.side = side;
        } else {
            System.out.println("Side cannot be Negative.");
        }
    }

    public double calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return 4 * side;
    }

    public double calculateDiagonal() {
        return side * Math.sqrt(2);
    }
}

// Cylinder inherits Circle
class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Height cannot be Negative.");
        }
    }

    public double calculateVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    public double calculateCurvedSurfaceArea() {
        return 2 * Math.PI * getRadius() * height;
    }

    public double calculateTotalSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }
}

class Sphere extends Circle {

    public double calculateSurfaceArea() {
        return 4 * Math.PI * getRadius() * getRadius();
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}

public class CustomPackage {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(15);
        System.out.println("Circle Circumference: " + c.calculateCircumference());

        Shape s = c;
        System.out.println("Circle Area: " + s.calculateArea());

        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(5);
        System.out.println("Rectangle Area: " + r.calculateArea());

        Square sq = new Square();
        sq.setSide(4);
        System.out.println("Square Area: " + sq.calculateArea());

        Cylinder cy = new Cylinder();
        cy.setRadius(3);
        cy.setHeight(7);
        System.out.println("Cylinder Volume: " + cy.calculateVolume());

        Sphere sp = new Sphere();
        sp.setRadius(3);
        System.out.println("Sphere Volume: " + sp.calculateVolume());
    }
}