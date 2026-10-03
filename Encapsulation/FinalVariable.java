package Encapsulation;

import java.util.*;

class EmployeeID {
    private final int id; // 'final' once assigned, it cannot be overwritten
    private boolean c = false;

    EmployeeID(int id) {
        if (id > 0) {
            this.id = id;
            c = true;
        } else {
            // assigning 0 if user enters -ve value because final variables cannot be kept
            // unassigned
            this.id = 0;
            System.out.println("Invalid ID");
            c = false;
        }
    }

    boolean getCheck() {
        return c;
    }

    int getID() {
        return id;
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        EmployeeID e = new EmployeeID(sc.nextInt());
        if (e.getCheck()) {
            System.out.println("Employee ID: " + e.getID());
        }

        sc.close();
    }
}
