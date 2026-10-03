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
    }

    // method to deposit money into the account
    void deposit(int depo) {
        if (depo >= 0) {
            balance += depo;
            System.out.println("Update Successful!");
        } else {
            System.out.println("Deposit cannot be negative. Try again!");
        }
    }

    // method to withdraw money from the account
    void withdraw(int wd) {
        if (wd < 0) {
            System.out.println("Withdraw cannot be negative. Try again!");
        } else if (wd > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= wd;
            System.out.println("Withdraw Successful!");
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
                System.out.println("\n----Bank Menu----\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        // updates balance
                        System.out.print("Enter amount: ");
                        ba.deposit(sc.nextInt());
                        break;

                    case 2:
                        // withdraws money
                        System.out.print("Enter amount: ");
                        ba.withdraw(sc.nextInt());
                        break;

                    case 3:
                        // checks balance
                        System.out.println("Current Balance: Rs. " + ba.getBal());
                        break;

                    case 4:
                        // exits program
                        System.out.println("Terminated");
                        break;

                    default:
                        System.out.println("Invalid");
                        break;
                }
            } while (ch != 4);
        }

        sc.close();
    }
}
