package Interfaces;

//interface #1
interface Chargeable {
    // abstract method
    void charge();

    // default method
    default void showStatus() {
        System.out.println("Device is ready to charge");
    }
}

// interface #2
interface Connectable {
    void connect();
}

// interface #3 inheriting from the interface #1 and #2
interface SmartDevice extends Chargeable, Connectable {
    void operate();
}

// class implementing interface #3
class SmartWatch implements SmartDevice {
    public void charge() {
        System.out.println("Device is charging");
    }

    public void connect() {
        System.out.println("Device is connecting");
    }

    public void operate() {
        System.out.println("Device is operating");
    }
}

public class InterfacesRecap {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch();
        sw.charge();
        sw.connect();
        sw.operate();
        sw.showStatus();
    }
}
