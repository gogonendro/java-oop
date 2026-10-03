package Encapsulation;

import java.util.*;

//write only means that a variable cannot be retrieved outside the class, therefore no getter
class Password {
    private String pass;

    void setPass(String pass) {
        this.pass = pass;
    }
}

public class WriteOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password p = new Password();

        System.out.print("Enter your password: ");
        p.setPass(sc.next());
        System.out.println("Password set successfully!");

        sc.close();
    }
}
