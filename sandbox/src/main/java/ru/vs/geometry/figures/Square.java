package ru.vs.geometry.figures;

public class Square {
    public static void printSquareArea(double a){
        String text = String.format("Area of a square with side %f = %f", a, SquareArea(a));
        System.out.println(text);
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
