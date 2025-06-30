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
        Payment p;

        p = new Payment();
        p.pay(); // Output: Paying using default method

        p = new UPIPayment();
        p.pay(); // Output: Paying using UPI

        p = new CardPayment();
        p.pay(); // Output: Paying using Credit Card
    }
}
