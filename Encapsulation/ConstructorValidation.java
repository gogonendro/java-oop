package Encapsulation;

import java.util.*;

class Ticket {
    private int price;
    private boolean check = false;

    // parameterized constructor initializes instance variable
    Ticket(int price) {
        // initialize only if entered value > 0
        if (price > 0) {
            this.price = price;
            check = true; // set check to true

        } else {
            System.out.println("Invalid price");
            check = false;
        }
    }

    // returns the value of check
    boolean getCheck() {
        return check;
    }

    // returns the value of price (getter)
    int getPrice() {
        return price;
    }
}

public class ConstructorValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket price: ");
        Ticket t = new Ticket(sc.nextInt());

        // if check is true, then print price
        if (t.getCheck()) {
            System.out.println("Ticket price: Rs. " + t.getPrice());
        }

        sc.close();
    }
}
