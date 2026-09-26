package Abstraction;

abstract class Person {
    String name;

    // receives name from the subclass constructor
    Person(String n) {
        name = n;
    }

    abstract void role();

    void display() {
        System.out.println("My name is " + name);
    }
}

class Student extends Person {

    Student(String n) {
        super(n);
        /*
         * Student("Akash")
         * ↓
         * super("Akash")
         * ↓
         * Person(String n)
         * ↓
         * name = n
         * ↓
         * display() uses name
         */
    }

    void role() {
        System.out.println("I am a student");
    }
}

class Teacher extends Person {

    Teacher(String n) {
        super(n);
    }

    void role() {
        System.out.println("I am a teacher");
    }
}

public class ParemeterizedAbs {
    public static void main(String[] args) {
        Student s = new Student("Akash");
        s.display();
        s.role();
        System.out.println();
        Teacher r = new Teacher("Rupa");
        r.display();
        r.role();
    }
}
