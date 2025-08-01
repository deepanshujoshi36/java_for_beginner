package overriding_package;
// Superclass
class Payment {
    void pay() {
        System.out.println("Paying using default method");
    }
}

// Subclass 1
class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using UPI");
    }
}

// Subclass 2
class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using Credit Card");
    }
}

public class example_overriding {
    public static void main(String[] args) {

        Payment p1 = new Payment();
        p1.pay(); // Output: Paying using default method

        Payment p2 = new UPIPayment();
        p2.pay(); // Output: Paying using UPI

        Payment p3 = new CardPayment();
        p3.pay(); // Output: Paying using Credit Card
    }
}
