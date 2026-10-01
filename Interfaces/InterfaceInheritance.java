package Interfaces;

interface Worker {
    void work();
}

// interface inheriting from another interface
interface Programmer extends Worker {
    void code();
}

// class implementing Programmer must implement methods from both interfaces
class JavaProgrammer implements Programmer {
    // implementation of interface 1
    public void work() {
        System.out.println("Programmer is working");
    }

    // implementation of interface 2
    public void code() {
        System.out.println("Programmer is coding in Java");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        JavaProgrammer jp = new JavaProgrammer();
        jp.work();
        jp.code();
    }
}
