package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("User1");
        hello("User2");
        hello("User3");

        Square square = new Square(5);
        System.out.println("Area of square with side " + square.l + " = " + square.squareArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle with sides " + rectangle.a + " and " + rectangle.b + " = " + rectangle.rectangleArea());
    }

    public static void hello(String word) {
        System.out.println("Hello, " + word + "!");
    }
}

