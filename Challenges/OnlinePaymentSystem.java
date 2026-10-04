package Challenges;

import java.util.*;

abstract class Payment {

    // instance variables
    private final String id;
    private int amount;

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
        System.out.println("\n---------- RECEIPT ----------\nTransaction ID: " + getId() + "\nAmount: Rs. "
                + getAmount() + "\nPayment Mode: UPI\n-----------------------------\n");
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
        System.out.println("\n---------- RECEIPT ----------\nTransaction ID: " + getId() + "\nAmount: Rs. "
                + getAmount() + "\nPayment Mode: Card\n-----------------------------\n");
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;
        Receipt r;
        int choice;

        String idValid;
        int amtValid;
        boolean idCancel;
        boolean amtCancel;
        do {

            System.out
                    .print("------- Payment Menu -------\n1. UPI Payment\n2. Card Payment\n3. Exit Payment Menu\n\nChoice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Transaction ID (or 'c' to cancel): ");
                    idValid = sc.next(); // stores valid id for transaction
                    idCancel = false; // set cancel checker to false

                    do {
                        // checks if user entered 'c'
                        if (idValid.equalsIgnoreCase("c")) {
                            System.out.println("Canceled!\n"); // then declare canceled
                            idCancel = true; // cancel is set to true
                            break; // break into Payment Menu
                        }

                        idValid = idValid.toUpperCase(); // convert entered id to uppercase

                        // check validity using regex
                        if (idValid.matches("[A-Z]{2}[0-9]{3}[A-Z]")) {
                            break; // accept the id and break from loop if valid
                        } else {
                            // else ask user to try again or cancel
                            System.out.print("Invalid ID. Try again (or 'c' to cancel): ");
                            idValid = sc.next();
                        }
                    } while (true); // do all of this until id is valid or canceled

                    if (idCancel) {
                        break; // break into menu if canceled
                    } else {
                        // else if the id is valid, ask for amount
                        System.out.print("Enter Amount (or '0' to cancel): ");
                        amtValid = sc.nextInt();
                        amtCancel = false;

                        do {
                            if (amtValid == 0) {
                                System.out.println("Canceled!\n");
                                System.out.println();
                                amtCancel = true;
                                break;
                            } else if (amtValid > 0) {
                                break;
                            } else {
                                System.out.print(
                                        "Amount must be greater than 0 (zero). Try again (or enter '0' to cancel): ");
                                amtValid = sc.nextInt();
                            }
                        } while (true);

                        if (amtCancel) {
                            break;
                        }

                        // if this segment is reached, then id and amount both are valid
                        UPIPayment upi = new UPIPayment(idValid, amtValid);
                        p = upi; // superclass reference for all the tasks
                        r = upi; // interface reference for receipt generation
                        System.out.println();
                        p.processPayment();
                        r.generateReceipt();
                        break;
                    }

                case 2:
                    System.out.print("Enter Transaction ID (or 'c' to cancel): ");
                    idValid = sc.next(); // stores valid id for transaction
                    idCancel = false; // set cancel checker to false

                    do {
                        // checks if user entered 'c'
                        if (idValid.equalsIgnoreCase("c")) {
                            System.out.println("Canceled!\n"); // then declare canceled
                            idCancel = true; // cancel is set to true
                            break; // break into Payment Menu
                        }

                        idValid = idValid.toUpperCase(); // convert entered id to uppercase

                        // check validity using regex
                        if (idValid.matches("[A-Z]{2}[0-9]{3}[A-Z]")) {
                            break; // accept the id and break from loop if valid
                        } else {
                            // else ask user to try again or cancel
                            System.out.print("Invalid ID. Try again (or 'c' to cancel): ");
                            idValid = sc.next();
                        }
                    } while (true); // do all of this until id is valid or canceled

                    if (idCancel) {
                        break; // break into menu if canceled
                    } else {
                        // else if the id is valid, ask for amount
                        System.out.print("Enter Amount (or '0' to cancel): ");
                        amtValid = sc.nextInt();
                        amtCancel = false;

                        do {
                            if (amtValid == 0) {
                                System.out.println("Canceled!\n");
                                amtCancel = true;
                                break;
                            } else if (amtValid > 0) {
                                break;
                            } else {
                                System.out.print(
                                        "Amount must be greater than 0 (zero). Try again (or enter '0' to cancel): ");
                                amtValid = sc.nextInt();
                            }
                        } while (true);

                        if (amtCancel) {
                            break;
                        }

                        // if this segment is reached, then id and amount both are valid
                        CardPayment card = new CardPayment(idValid, amtValid);
                        p = card; // superclass reference for all the tasks
                        r = card; // interface reference for receipt generation
                        System.out.println();
                        p.processPayment();
                        r.generateReceipt();
                        break;
                    }

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
