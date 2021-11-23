package com.company;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA(){return sideA;}
    public int getSideB(){return sideB;}
    public int getSideC(){return sideC;}

    public static int getArea(int sideA, int sideB, int sideC)
    {
        return sideA+sideC/2;
    }
    public static int getPerimeter(int sideA, int sideB, int sideC)
    {
        return sideA+sideB+sideC;

    }
}
