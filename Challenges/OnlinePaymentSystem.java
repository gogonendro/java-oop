package Challenges;

import java.util.*;

abstract class Payment {
    // instance variables
    private final String id;
    private int amount;
    private boolean amtCheck;
    private boolean idCheck;

    // parameterized constructor to initialize variables
    Payment(String id, int amount) {
        id = id.toUpperCase();
        // checks if ID matches the expected format
        if (id.matches("[A-Z]{2}[0-9]{3}[A-Z]")) {
            this.id = id;
            idCheck = true;
        } else {
            this.id = "INVALID";
            System.out.println("Invalid ID. Try again!\nFormat - (letter)(letter)(digit)(digit)(digit)(letter)");
            idCheck = false;
        }

        if (amount > 0) {
            this.amount = amount;
            amtCheck = true;
        } else {
            System.out.println("Amount must be greater than 0 (zero). Try again!");
            amtCheck = false;
        }
    }

    String getId() {
        return id;
    }

    int getAmount() {
        return amount;
    }

    boolean amtChecker() {
        return amtCheck;
    }

    boolean idChecker() {
        return idCheck;
    }

    // abstract method to process payment
    abstract void processPayment();
}

// interface to generate receipt
interface Receipt {
    void generateReceipt();
}

class UPIPayment extends Payment implements Receipt {
    UPIPayment(String id, int amount) {
        super(id, amount);
    }

    void processPayment() {
        System.out.println("Payment processed through UPI");
    }

    public void generateReceipt() {
        System.out.println("\n---------- RECEIPT ----------\nTransaction ID: " + super.getId() + "\nAmount: Rs. "
                + super.getAmount() + "\nPayment Mode: UPI\n-----------------------------\n");
    }
}

class CardPayment extends Payment implements Receipt {
    CardPayment(String id, int amount) {
        super(id, amount);
    }

    void processPayment() {
        System.out.println("\nPayment processed through Card");
    }

    public void generateReceipt() {
        System.out.println("\n---------- RECEIPT ----------\nTransaction ID: " + super.getId() + "\nAmount: Rs. "
                + super.getAmount() + "\nPayment Mode: Card\n-----------------------------\n");
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;
        Receipt r;
        int choice;
        do {

            System.out
                    .print("------- Payment Menu -------\n1. UPI Payment\n2. Card Payment\n3. Exit Payment Menu\n\nChoice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Transaction ID and Amount:");
                    UPIPayment upi = new UPIPayment(sc.next(), sc.nextInt());
                    p = upi; // superclass reference for all the tasks
                    r = upi; // interface reference for receipt generation
                    System.out.println();
                    if (p.amtChecker() && p.idChecker()) {
                        p.processPayment();
                        r.generateReceipt();
                    }
                    break;

                case 2:
                    System.out.println("Enter Transaction ID and Amount:");
                    CardPayment card = new CardPayment(sc.next(), sc.nextInt());
                    p = card;
                    r = card;
                    System.out.println();
                    if (p.amtChecker() && p.idChecker()) {
                        p.processPayment();
                        r.generateReceipt();
                    }
                    break;

                case 3:
                    System.out.println("Thank you. Visit again!\nTerminated.\n");
                    break;

                default:
                    System.out.println("Invalid. Try again!");
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}
