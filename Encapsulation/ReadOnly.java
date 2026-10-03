package Encapsulation;

import java.util.*;

//no setter is included in the class, so the value of id cannot be changed outside StudentID
class StudentID {
    private int id;
    private boolean c = false;

    StudentID(int id) {
        if (id > 0) {
            this.id = id;
            c = true;
        } else {
            System.out.println("Invalid ID. Try again!");
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

public class ReadOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        StudentID s = new StudentID(sc.nextInt());

        if (s.getCheck()) {
            System.out.println("Student ID: " + s.getID());
        }

        sc.close();
    }
}
