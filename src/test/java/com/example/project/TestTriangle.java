package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriangle {

    @Test
    public void testNullConstructor() {
        String description = "Checking if constructing with no parameters yields correct triangle coordinates";
        try {
            Triangle myTriangle = new Triangle();
            assertEquals(0.0, myTriangle.getx0(), 0.01);
            assertEquals(0.0, myTriangle.gety0(), 0.01);
            assertEquals(0.0, myTriangle.getx1(), 0.01);
            assertEquals(0.0, myTriangle.gety1(), 0.01);
            assertEquals(0.0, myTriangle.getx2(), 0.01);
            assertEquals(0.0, myTriangle.gety2(), 0.01);

            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testDefaultConstructor() {
        String description = "Checking that parameters correspond to correct instance variables in constructor";
        try {
            Triangle myTriangle = new Triangle(1, 4, 3, 5, 2, 10);
            assertEquals(1.0, myTriangle.getx0(), 0.01);
            assertEquals(4.0, myTriangle.gety0(), 0.01);
            assertEquals(3.0, myTriangle.getx1(), 0.01);
            assertEquals(5.0, myTriangle.gety1(), 0.01);
            assertEquals(2.0, myTriangle.getx2(), 0.01);
            assertEquals(10.0, myTriangle.gety2(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testTranslateX() {
        String description = "testing translateX";
        try {
            Triangle myTriangle = new Triangle(1, 4, 3, 5, 2, 10);
            myTriangle.translateX(-3);
            assertEquals(-2.0, myTriangle.getx0(), 0.01);
            assertEquals(4.0, myTriangle.gety0(), 0.01);
            assertEquals(0.0, myTriangle.getx1(), 0.01);
            assertEquals(5.0, myTriangle.gety1(), 0.01);
            assertEquals(-1.0, myTriangle.getx2(), 0.01);
            assertEquals(10.0, myTriangle.gety2(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testTranslateY() {
        String description = "testing translateY";
        try {
            Triangle myTriangle = new Triangle(1, 4, 3, 5, 2, 10);
            myTriangle.translateY(2.5);
            assertEquals(1.0, myTriangle.getx0(), 0.01);
            assertEquals(6.5, myTriangle.gety0(), 0.01);
            assertEquals(3.0, myTriangle.getx1(), 0.01);
            assertEquals(7.5, myTriangle.gety1(), 0.01);
            assertEquals(2.0, myTriangle.getx2(), 0.01);
            assertEquals(12.5, myTriangle.gety2(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testNullArea() {
        String description = "testing area of degenerate triangle";
        try {
            Triangle myTriangle = new Triangle();
            assertEquals(0.0, myTriangle.area(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");
            throw e;
        }
    }

    @Test
    public void testArea() {
        String description = "testing area of basic right triangle";
        try {
            Triangle myTriangle = new Triangle(0, 0, 1, 0, 0, 1);
            assertEquals(0.5, myTriangle.area(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");
            throw e;
        }
    }

    @Test
    public void testNullPerimeter() {
        String description = "testing perimeter of degenerate triangle";
        try {
            Triangle myTriangle = new Triangle();
            assertEquals(0.0, myTriangle.perimeter(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");
            throw e;
        }
    }

    @Test
    public void testPerimeter() {
        String description = "testing perimeter of basic right triangle";
        try {
            Triangle myTriangle = new Triangle(0, 0, 1, 0, 0, 1);
            assertEquals(3.4142, myTriangle.perimeter(), 0.01);
            System.out.println(description + " - passed");
        } catch (AssertionError e) {
            System.out.println(description + " - failed");
            throw e;
        }
    }

}