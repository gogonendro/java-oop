package Encapsulation;

class Book {
    private int price;

    // parameterized constructor initializes the private variable
    Book(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

public class ConstructorEncapsulation {
    public static void main(String[] args) {
        Book b = new Book(250);
        System.out.println("MRP: Rs. " + b.getPrice() + "/-");
    }
}
