public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(9.0);

        printSquareRectangleArea(3.0, 5.0);
    }

    private static void printSquareRectangleArea(double a, double b) {
        System.out.println("Area of a rectangle with side " + a + " and side " + b + " = " + RectangleArea(a,b));
    }

    private static double RectangleArea(double a, double b) {
        return a*b;
    }

    static void printSquareArea(double a){
        System.out.println("Area of a square with side " + a + " = " + SquareArea(a));
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
