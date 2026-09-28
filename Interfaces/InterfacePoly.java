package Interfaces;

interface Device {
    void start();
}

class Laptop implements Device {
    public void start() {
        System.out.println("Starting the laptop... Done");
    }
}

class Smartphone implements Device {
    public void start() {
        System.out.println("Starting the smartphone... Done");
    }
}

public class InterfacePoly {
    public static void main(String[] args) {
        Device d;
        d = new Laptop(); // using interface reference
        d.start();
        d = new Smartphone();
        d.start();
    }
}
