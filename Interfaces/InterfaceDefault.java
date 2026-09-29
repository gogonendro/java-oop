package Interfaces;

interface Appliance {
    void operate();

    // default method: implementing classes do not have to override it;
    // the interface provides the default implementation
    default void showType() {
        System.out.println("This is an appliance");
    }
}

class WashingMachine implements Appliance {
    public void operate() {
        System.out.println("A washing machine washes clothes efficiently");
    }
}

public class InterfaceDefault {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.operate();
        wm.showType(); // wm can directly call showType() without implementing it in WashingMachine
    }
}