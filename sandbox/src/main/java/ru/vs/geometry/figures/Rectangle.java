package ru.vs.geometry.figures;

public class Rectangle {
    public static void printSquareRectangleArea(double a, double b) {
        var text = String.format("Area of a rectangle with side %f and side %f = %f", a, b, RectangleArea(a,b));
        System.out.println(text);
    }

    private static double RectangleArea(double a, double b) {
        return a*b;
    }
}
