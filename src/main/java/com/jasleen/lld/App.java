package com.jasleen.lld;

import com.jasleen.lld.beginner.EventNotificationSystem.ConcreteEventObservable;
import com.jasleen.lld.beginner.EventNotificationSystem.ConcreteEventObserver;
import com.jasleen.lld.beginner.EventNotificationSystem.EventObservable;
import com.jasleen.lld.beginner.EventNotificationSystem.EventObserver;
import com.jasleen.lld.beginner.Logger.Logger;
import com.jasleen.lld.beginner.PizzaOrderBuilder.*;
import com.jasleen.lld.beginner.ShapeAreaCalculator.ShapeAreaCalculator;
import com.jasleen.lld.beginner.TextDecorator.BoldTextDecorator;
import com.jasleen.lld.beginner.TextDecorator.ItalicTextDecorator;
import com.jasleen.lld.beginner.TextDecorator.SimpleText;
import com.jasleen.lld.beginner.TextDecorator.TextDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        callSingleton();

        callShapeAreaCalculator();

        callTextDecorator();

        callEventNotificationSystem();

        callPizzaBuilder();

    }

    private static void callPizzaBuilder() {
        Pizza pizza = new PizzaBuilder()
                .withSize(Size.MEDIUM)
                .withTopping(new CheeseTopping())
                .build();

        System.out.println(pizza.toString());
    }

    private static void callEventNotificationSystem() {
        // Create an event subject
        EventObservable eventSubject = new ConcreteEventObservable();

        // Create observers
        EventObserver observer1 = new ConcreteEventObserver();
        EventObserver observer2 = new ConcreteEventObserver();

        // Register observers with the subject
        eventSubject.subscribe(observer1);
        eventSubject.subscribe(observer2);

        // Trigger an event
        eventSubject.notifyObservers("Event 1 occurred!");

        // Unregister one observer and trigger another event
        eventSubject.unsubscribe(observer1);
        eventSubject.notifyObservers("Event 2 occurred!");
    }

    private static void callTextDecorator() {
        TextDecorator textDecorator1 = new BoldTextDecorator(new SimpleText("hi there"));
        System.out.println(textDecorator1.getText());

        TextDecorator textDecorator2 = new ItalicTextDecorator(new BoldTextDecorator(new SimpleText("hi there")));
        System.out.println(textDecorator2.getText());
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
