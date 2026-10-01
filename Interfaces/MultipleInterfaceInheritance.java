package Interfaces;

interface Employee {
    void attend();
}

interface Skilled {
    void performSkill();
}

// interface inheriting from multiple interfaces
interface Professional extends Employee, Skilled {
    void report();
}

class SoftwareEng implements Professional {
    public void attend() {
        System.out.println("Attending work");
    }

    public void performSkill() {
        System.out.println("Performing technical skill");
    }

    public void report() {
        System.out.println("Reporting");
    }
}

public class MultipleInterfaceInheritance {
    public static void main(String[] args) {
        SoftwareEng se = new SoftwareEng();
        se.attend();
        se.performSkill();
        se.report();
    }
}
