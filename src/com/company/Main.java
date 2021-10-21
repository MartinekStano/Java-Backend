package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(6,7,8);

        System.out.println("Triangle #1");
        System.out.println("Area: "+Triangle.getArea(triangle1.getSideA(),triangle1.getSideB(),triangle1.getSideC()));
        System.out.println("Perimeter: "+Triangle.getPerimeter(triangle1.getSideA(),triangle1.getSideB(),triangle1.getSideC()));

        System.out.println("Triangle #2");
        System.out.println("Area: "+Triangle.getArea(triangle2.getSideA(),triangle2.getSideB(),triangle2.getSideC()));
        System.out.println("Perimeter: "+Triangle.getPerimeter(triangle2.getSideA(),triangle2.getSideB(),triangle2.getSideC()));

    }
}
