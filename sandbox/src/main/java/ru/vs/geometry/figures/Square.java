package ru.vs.geometry.figures;

public class Square {
    public static void printSquareArea(double a){
        System.out.println("Area of a square with side " + a + " = " + SquareArea(a));
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
