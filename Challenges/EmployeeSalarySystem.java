package Challenges;

import java.util.*;

//superclass
abstract class Employee {
    // private instance variables
    private final int id;
    private String name;

    // parameterized constructor to initialize name and ID
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getter to get name
    String getName() {
        return name;
    }

    // getter to get ID
    int getId() {
        return id;
    }

    // abstract method to calculate salary in subclasses
    abstract int calculateSalary();
}

// subclass #1
class FullTimeEmployee extends Employee {

    // initializing name and ID through super constructor
    FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    // calculating salary in abstract method
    int calculateSalary() {
        int monthlySalary = 50000;
        return monthlySalary;
    }
}

// subclass #2
class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, int id) {
        super(name, id);
    }

    // stores the working hours
    int hours;

    // initializes working hours if positive
    boolean hoursWorked(int hours) {
        if (hours > 0) {
            this.hours = hours;
            return true;
        } else {
            System.out.println("Invalid hours\n");
            return false;
        }
    }

    int calculateSalary() {
        int salary = hours * 100; // getting salary by multiplying hours with pay-per-hour
        return salary;
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e; // superclass reference
        int ch; // choice variable for employee menu

        do {
            System.out.println("----Employee Menu----\n1. Full-Time Employee\n2. Part-Time Employee\n3. Exit");
            ch = sc.nextInt();

            switch (ch) {
                // for full-time employee
                case 1:
                    System.out.println("Enter Employee Name and ID:");
                    // creating object refering to superclass
                    e = new FullTimeEmployee(sc.next(), sc.nextInt());

                    System.out
                            .println(
                                    "\n----EMPLOYEE LOG----\nName: " + e.getName() + "\nID: " + e.getId()
                                            + "\nSalary: Rs. " + e.calculateSalary() + "\n");
                    break;

                /// for part-time employee
                case 2:
                    System.out.println("Enter Employee Name and ID:");
                    // creating object refering to its own class
                    PartTimeEmployee p = new PartTimeEmployee(sc.next(), sc.nextInt());
                    e = p; // superclass refering to the same object

                    System.out.println("\n----EMPLOYEE LOG----\nName: " + e.getName() + "\nID: " + e.getId());

                    System.out.print("Enter hours worked: ");

                    if (p.hoursWorked(sc.nextInt())) {
                        System.out.println("\nSalary: Rs. " + e.calculateSalary() + "\n");

                    }
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
