package Abstraction;

/* An abstract class acts as a base class, defining methods that must be implemented by its subclasses, but the subclasses are free to implement the methods differently */

/* Abstraction defines what subclasses must do, while allowing subclasses to decide how they do it */

abstract class Shape { // abstract base class
    abstract void draw(); // abstract method

    void display() {
        System.out.println("This is a shape");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square is drawn"); // implementation of abstract method in subclass
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // Shape sh = new Shape(); <-- object creation directly from abstract class is impossible
        Shape sh = new Square(); // using abstract class reference for subclass object
        // calling both methods
        sh.draw();
        sh.display();
    }
}
