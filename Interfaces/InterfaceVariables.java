package Interfaces;

interface Bank {
    int rate = 7; /*
                   * 'int rate' is effectively 'public static final int rate' where,
                   * 'static' means it belongs to the interface itself and is not an object
                   * 'final' means the value cannot be overwritten
                   */
}

class Customer implements Bank {
    void display() {
        System.out.println("Interest Rate: " + rate + "%"); // accessing interface variable
    }
}

public class InterfaceVariables {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.display();
    }
}
