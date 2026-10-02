package Encapsulation;

class Employee {
    private int salary;

    // setter: changes the value of the private variable
    void setSalary(int s) {
        salary = s;
    }

    // getter: returns the private variable's value
    // getter != printing the value
    int getSalary() {
        return salary;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: Rs. " + e.getSalary());
    }
}
