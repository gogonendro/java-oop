package Interfaces;

interface Payment {
    default void showMessage() {
        System.out.println("Payment is being processed... Done");
    }
}

class OnlinePayment implements Payment {
    // overriding the default method in interface Payment
    public void showMessage() {
        System.out.println("Online Payment is being processed... Done");
    }
}

public class DefaultOverride {
    public static void main(String[] args) {
        OnlinePayment op = new OnlinePayment();
        op.showMessage();
    }
}
