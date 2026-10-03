package Challenges;

import java.util.*;

class Vehicle {
    // private instance variables
    private final String vehiNum;
    private String brand;

    // parameterized constructor to initialize vehicle number and brand
    Vehicle(String vehiNum, String brand) {
        this.vehiNum = vehiNum;
        this.brand = brand;
    }

    // gets the number of vehicle
    String getNum() {
        return vehiNum;
    }

    // gets the brand name of vehicle
    String getBrand() {
        return brand;
    }

    // displays the mileage of the vehicle
    void calculateMileage() {
        // to be overridden
    }
}

// sublcass inheriting from superclass
class Car extends Vehicle {
    // initializes number and brand through super constructor
    Car(String vehiNum, String brand) {
        super(vehiNum, brand);

    }

    // prints the mileage
    void calculateMileage() {
        System.out.println("50 km/l");
    }
}

class Bike extends Vehicle {
    Bike(String vehiNum, String brand) {
        super(vehiNum, brand);
    }

    void calculateMileage() {
        System.out.println("10 km/l");
    }
}

public class VehicleManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v; // reference to super
        int ch;

        // do-while loop with switch case for menu
        do {
            System.out.println("\n---- Vehicle Menu ----\n1. Car\n2. Bike\n3. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Car number and brand:");
                    v = new Car(sc.next(), sc.next());
                    System.out.print(
                            "\nNumber: " + v.getNum() + "\nBrand: " + v.getBrand() + "\nMileage: ");
                    v.calculateMileage();
                    break;

                case 2:
                    System.out.println("Enter Bike number and brand:");
                    v = new Bike(sc.next(), sc.next());
                    System.out.print(
                            "\nNumber: " + v.getNum() + "\nBrand: " + v.getBrand() + "\nMileage: ");
                    v.calculateMileage();
                    break;

                case 3:
                    System.out.println("Terminated");
                    break;

                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (ch != 3);

        sc.close();
    }
}