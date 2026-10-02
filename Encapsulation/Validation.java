package Encapsulation;

import java.util.*;

class Student {
    private int marks;

    // setter
    boolean setMarks(int m) {
        // change marks only if condition is met
        if (m >= 0 && m <= 100) {
            marks = m;
            return true;
        } else {
            System.out.println("Invalid marks");
            return false;
        }
    }

    // getter
    int getMarks() {
        return marks;
    }
}

public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        System.out.print("Enter marks: ");

        if (s.setMarks(sc.nextInt())) {
            System.out.println("Marks: " + s.getMarks() + "/100");
        }

        sc.close();
    }
}
