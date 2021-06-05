package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Alex");
        hello("Lara");
        hello("Tim");
        System.out.println();

        double l = 5;
        System.out.println("Area of square with side 5 = " + squareArea(l));
        System.out.println();

        double a = 4;
        double b = 6;
        System.out.println("Area of rectangle with sides " + a + " and " + b + " = " + rectangleArea(a, b));
    }

    public static void hello(String word) {
        System.out.println("Hello, " + word + "!");
    }

    public static double squareArea(double l) {
        return l * l;
    }

    public static double rectangleArea(double a, double b) {
        return (a * b);
    }
}

