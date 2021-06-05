package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {

    @Test
    public void testArea() {
        Square square = new Square(5);
        square.squareArea();
        Assert.assertEquals(square.squareArea(),25.0);
    }
}
