package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
  public static void main(String args[])
  {
    Circle circ = new Circle(10);
    Rectangle rect = new Rectangle(10, 150);

    double circArea = Math.PI*Math.pow(circ.radius, 2);
    double rectArea = rect.length * rect.breadth;

    System.out.printf("Area of the circle is: %s ", circArea);
    System.out.println();
    System.out.printf("Area of the rectangle is: %s", rectArea);
  }
}
