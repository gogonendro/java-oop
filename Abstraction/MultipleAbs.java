package Abstraction;

abstract class Employee {
    abstract void work(); // abstract method 1

    abstract void salary(); // abstract method 2

    void display() {
        System.out.println("I am an Employee");
    }
}

class Dev extends Employee {
    void work() {
        System.out.println("I am a Developer");
    }

    void salary() {
        System.out.println("I have 18 LPA salary");
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("I am the Manager");
    }

    void salary() {
        System.out.println("I have 20 LPA salary");
    }
}

public class MultipleAbs {
    public static void main(String[] args) {
        Employee em;

        em = new Dev();
        em.display();
        em.work();
        em.salary();
        System.out.println();
        em = new Manager();
        em.display();
        em.work();
        em.salary();
    }

}
