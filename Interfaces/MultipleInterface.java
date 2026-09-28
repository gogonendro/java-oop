package Interfaces;

//first interface
interface Printable {
    void print();
}

// second interface
interface Scannable {
    void scan();
}

// a class can implement multiple interfaces
class MultiFunctionPrinter implements Printable, Scannable {
    // method from 'Printable' interface
    public void print() {
        System.out.println("Document is being printed... Done!");
    }

    // method from 'Scannable' interface
    public void scan() {
        System.out.println("Document is being scanned... Done!");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        MultiFunctionPrinter m = new MultiFunctionPrinter();
        m.print();
        m.scan();
    }
}