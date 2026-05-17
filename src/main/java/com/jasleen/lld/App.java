package com.jasleen.lld;

import com.jasleen.lld.beginner.Logger;
import com.jasleen.lld.beginner.ShapeAreaCalculator;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        callSingleton();

        callShapeAreaCalculator();

    }

    public static void callShapeAreaCalculator() {
        ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();

        System.out.println(shapeAreaCalculator.calculateArea("Circle", 5));
        System.out.println(shapeAreaCalculator.calculateArea("Square", 4));
        System.out.println(shapeAreaCalculator.calculateArea("Rectangle", 4, 5));
    }

    private static void callSingleton() {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        System.out.println(logger1 == logger2);
    }
}
