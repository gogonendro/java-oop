package Abstraction;

//base abstract class 
abstract class Animal {
    abstract void sound(); // method which must be implemented in every subclass

    void display() { // concrete method
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    // display() will override the display() in abstract class
    void display() {
        System.out.println("This is a dog");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }

    // display() will override the display() in the abstract class
    void display() {
        System.out.println("This is a cat");
    }
}

public class MultiSubclass {
    public static void main(String[] args) {
        Animal a; // reference of abstract class

        // creating subclass objects and calling sound() and display()
        a = new Dog();
        a.sound();
        a.display();

        a = new Cat();
        a.sound();
        a.display();
    }
}
