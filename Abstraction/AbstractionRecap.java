package Abstraction;

abstract class Appliance {
    String brand;

    // parameterized constructor
    Appliance(String b) {
        brand = b;
    }

    // abstract methods
    abstract void operate();

    abstract void power();

    // concrete method
    void display() {
        System.out.println("Brand: " + brand);
    }
}

class WashingMachine extends Appliance {
    // parameterized constructor using super()
    WashingMachine(String b) {
        super(b);
    }

    // implementing abstract methods
    void operate() {
        System.out.println("Washing Machine washes clothes efficiently");
    }

    void power() {
        System.out.println("Takes 10 units power");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String b) {
        super(b);
    }

    void operate() {
        System.out.println("Refrigerator keeps food preserved");
    }

    void power() {
        System.out.println("Takes 20 units power");
    }
}

public class AbstractionRecap {
    public static void main(String[] args) {
        Appliance a;

        a = new WashingMachine("LG");
        a.operate();
        a.power();
        a.display();
        System.out.println();
        a = new Refrigerator("Samsung");
        a.operate();
        a.power();
        a.display();
    }
}
