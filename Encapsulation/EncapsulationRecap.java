package Encapsulation;

import java.util.*;

class MyBank {
    private int accNum;
    private int balance;
    private final String accHold;
    private boolean c1; // checker for validity of account number

    // parameterized constructor to initialize instance variables
    MyBank(String accHold, int accNum) {
        this.accHold = accHold;

        if (accNum > 0) {
            this.accNum = accNum;
            c1 = true;
        } else {
            System.out.println("ERROR: Invalid account number");
            c1 = false;
        }

        /*
         * if (balance >= 0) {
         * this.balance = balance;
         * c2 = true;
         * } else {
         * System.out.
         * println("ERROR: Initial balance must be greater than or equal to 0");
         * c2 = false;
         * }
         */
    }

    // method to deposit money into the account
    void deposit(int balance) {
        if (balance >= 0) {
            this.balance += balance;
            System.out.println("Update Successful!");
            // c2 = true;
        } else {
            System.out.println("Deposit cannot be negative. Try again!");
            // c2 = false;
        }
    }

    int getAccNum() {
        return accNum;
    }

    int getBal() {
        return balance;
    }

    boolean getCheck1() {
        return c1;
    }

    /*
     * boolean getCheck2() {
     * return c2;
     * }
     */

    String getAccHold() {
        return accHold;
    }
}

public class EncapsulationRecap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the Account Holder, Account Number");
        MyBank ba = new MyBank(sc.nextLine(), sc.nextInt());

        int ch; // choice for menu

        // print everything only if account number is valid
        if (ba.getCheck1()) {
            System.out.println("Account Holder: " + ba.getAccHold() + "\nAccount Number: " + ba.getAccNum());

            do {
                System.out.println("\n----Bank Menu----\n1. Deposit\n2. Check Balance\n3. Exit");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        // updates balance
                        System.out.print("Enter amount: ");
                        ba.deposit(sc.nextInt());
                        /*
                         * if (ba.getCheck2()) {
                         * System.out.println("Update Successful!");
                         * }
                         */
                        break;

                    case 2:
                        // checks balance
                        System.out.println("Current Balance: Rs. " + ba.getBal());
                        break;

                    case 3:
                        // exits program
                        System.out.println("Terminated");
                        break;

                    default:
                        System.out.println("Invalid");
                        break;
                }
            } while (ch != 3);
        }

        sc.close();
    }
}
