package Encapsulation;

import java.util.*;

class MyBank {
    private int accNum;
    private int balance;
    private final String accHold;
    private boolean c1, c2; // checkers for validity of account number and balance

    // parameterized constructor to initialize instance variables
    MyBank(String accHold, int accNum, int balance) {
        this.accHold = accHold;

        if (accNum > 0) {
            this.accNum = accNum;
            c1 = true;
        } else {
            System.out.println("ERROR: Invalid account number");
            c1 = false;
        }

        if (balance >= 0) {
            this.balance = balance;
            c2 = true;
        } else {
            System.out.println("ERROR: Initial balance must be greater than or equal to 0");
            c2 = false;
        }
    }

    // setter to modify balance later
    void setBal(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
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

    boolean getCheck2() {
        return c2;
    }

    String getAccHold() {
        return accHold;
    }
}

public class EncapsulationRecap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the Account Holder, Account Number, and Balance");
        MyBank ba = new MyBank(sc.nextLine(), sc.nextInt(), sc.nextInt());

        // print everything only if account number and balance are valid
        if (ba.getCheck1() && ba.getCheck2()) {
            System.out.println("Account Holder: " + ba.getAccHold() + "\nAccount Number: " + ba.getAccNum()
                    + "\nTotal Balance: Rs. " + ba.getBal());
        }

        // updates balance
        System.out.println("Update Balance: ");
        ba.setBal(sc.nextInt());
        System.out.println("Updated Balance: Rs. " + ba.getBal());

        sc.close();
    }
}
