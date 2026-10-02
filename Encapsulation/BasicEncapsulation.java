package Encapsulation;

class BankAccount {
    // variable with 'private' access
    private int balance;

    void setBalance(int b) {
        balance = b;
    }

    void displayBalance() {
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BasicEncapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        // ba.balance = 100; --> not possible because 'balance' is private
        ba.setBalance(100);
        ba.displayBalance();
    }
}
