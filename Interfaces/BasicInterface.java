package Interfaces;

interface Vehicle {
    // anything that implements Vehicle, must provide a start()
    void start();
}

class Car implements Vehicle { // 'implements' keyword
    public void start() { // start() is implicitly public, that's why "public void start()"
        System.out.println("Car has started");
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        Vehicle v = new Car(); // interface reference 'v'
        v.start();
    }
}
