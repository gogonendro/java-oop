package Abstraction;

abstract class Vehicle {
    /*
     * An abstract class can have a constructor, and that constructor executes
     * whenever a subclass object is created
     */
    Vehicle() {
        System.out.println("This is Vehicle Constructor");
    }

    abstract void start();
}

class Car extends Vehicle {
    Car() {
        System.out.println("This is Car Constructor");
    }

    void start() {
        System.out.println("Car has started");
    }
}

public class ConstructorAbs {
    public static void main(String[] args) {
        Car c = new Car(); // execution order: vehicle() --> car()
        c.start(); // implementation of abstract method
    }
}
