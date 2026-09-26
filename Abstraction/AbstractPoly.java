package Abstraction;

abstract class Payment {
    abstract void pay();

    void receipt() {
        System.out.println("Payment receipt generated");
    }
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Payment proceeding via card...");
    }
}

class CashPayment extends Payment {
    void pay() {
        System.out.println("Payment proceeding via cash...");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Payment proceeding via UPI...");
    }
}

public class AbstractPoly {
    public static void main(String[] args) {
        Payment p;

        p = new CardPayment();
        p.pay();
        p.receipt();
        System.out.println();
        p = new CashPayment();
        p.pay();
        p.receipt();
        System.out.println();
        p = new UPIPayment();
        p.pay();
        p.receipt();
    }
}
