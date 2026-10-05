package Challenges;

import java.util.*;

abstract class Payment {

    // instance variables
    private final String id;
    private final int amount;

    // parameterized constructor to initialize variables
    Payment(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    String getId() {
        return id;
    }

    int getAmount() {
        return amount;
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
        System.out.println("\n---------- RECEIPT ----------\nTransaction ID: " + getId() + "\nAmount: "
                + getAmount() + " INR" + "\nPayment Mode: UPI\n-----------------------------\n");
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
        System.out.println("\n---------- RECEIPT ----------\nTransaction ID: " + getId() + "\nAmount: "
                + getAmount() + " INR" + "\nPayment Mode: Card\n-----------------------------\n");
    }
}

public class OnlinePaymentSystem {

    // method to check validity of entered ID
    static String getValidId(Scanner sc) {
        System.out.print("\nEnter Transaction ID (or 'c' to cancel): ");
        String id = sc.next(); // stores the id
        do {
            if (id.equalsIgnoreCase("c")) {
                System.out.println("Payment Canceled!\n");
                return null; // return nothing if canceled
            }
            id = id.toUpperCase(); // convert to uppercase
            // check for valid expected id format using regex
            if (id.matches("[A-Z]{2}[0-9]{3}[A-Z]")) {
                return id; // if format matches, return id
            } else {
                System.out.print(
                        // print invalid message, and ask to try again
                        "Invalid ID. ID Format (letter)(letter)(digit)(digit)(digit)(letter).\nTry again (or enter 'c' to cancel): ");
                id = sc.next();
            }
        } while (true);
    }

    // method to check for valid amount
    static int getValidAmount(Scanner sc) {
        System.out.print("\nEnter Amount in Indian Rupees (or '0' to cancel): ");
        int amount = sc.nextInt(); // stores the entered amount

        do {
            if (amount == 0) {
                System.out.println("Payment Canceled!\n");
                return 0; // return nothing if canceled
            } else if (amount > 0) {
                return amount; // return valid amount
            } else {
                // print invalid message and ask to try again
                System.out.print("Amount must be greater than 0.\nTry again (or enter '0' to cancel): ");
                amount = sc.nextInt();
            }
        } while (true);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;
        Receipt r;
        int choice;

        String id;
        int amount;

        do {

            System.out
                    .print("------- Payment Menu -------\n1. UPI Payment\n2. Card Payment\n3. Exit Payment Menu\n\nChoice: ");
            choice = sc.nextInt();

            switch (choice) {
                // case for UPI Payment
                case 1:
                    id = getValidId(sc); // get ID from via method
                    // if user cancels
                    if (id == null) {
                        break; // break into menu
                    }

                    amount = getValidAmount(sc); // get to this only if user doesn't cancel and enters valid id

                    // if user cancels
                    if (amount == 0) {
                        break; // break into menu
                    }

                    UPIPayment upi = new UPIPayment(id, amount);
                    p = upi; // Payment reference for processing payment
                    r = upi; // Receipt reference to generate receipt
                    System.out.println();
                    p.processPayment();
                    r.generateReceipt();

                    break;

                // case for card Payment
                case 2:
                    id = getValidId(sc); // get ID from via method
                    // if user cancels
                    if (id == null) {
                        break; // break into menu
                    }

                    amount = getValidAmount(sc); // get to this only if user doesn't cancel and enters valid id

                    // if user cancels
                    if (amount == 0) {
                        break; // break into menu
                    }

                    CardPayment card = new CardPayment(id, amount);
                    p = card; // Payment reference for processing payment
                    r = card; // Receipt reference to generate receipt
                    System.out.println();
                    p.processPayment();
                    r.generateReceipt();

                    break;

                case 3:
                    System.out.println("\nThank you. Visit again!\nTerminated.\n");
                    break;

                default:
                    System.out.println("\nInvalid. Try again!");
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}