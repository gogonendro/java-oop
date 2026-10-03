package Encapsulation;

class Product {
    private int price;

    // price refers to both the parameter and the instance variable
    void setPrice(int price) {
        /*
         * 'this' refers to the current object, so 'this.price' refers to the object's
         * instance variable
         */
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);
        System.out.println("Price: Rs. " + p.getPrice());
    }
}
