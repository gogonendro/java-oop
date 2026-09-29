package Interfaces;

interface School {
    // static method only belongs to the interface
    static void showSchool() {
        System.out.println("This is a school interface");
    }
}

class Student implements School {
    void display() {
        System.out.println("Student object created");
    }
}

public class InterfaceStatic {
    public static void main(String[] args) {
        Student st = new Student();
        st.display();
        // School sc = new School(); -> impossible
        School.showSchool(); // calls the static method
    }
}
