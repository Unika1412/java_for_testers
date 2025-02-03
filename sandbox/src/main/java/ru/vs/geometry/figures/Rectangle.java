package ru.vs.geometry.figures;

public class Rectangle {
    public static void printSquareRectangleArea(double a, double b) {
        System.out.println("Area of a rectangle with side " + a + " and side " + b + " = " + RectangleArea(a,b));
    }

    private static double RectangleArea(double a, double b) {
        return a*b;
    }
}
