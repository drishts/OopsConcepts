public class AbstractionExample2 {
    public static void main(String[] args) {
        double amount = 50499.3; // Example amount to be paid

        // Creating different payment method objects
        PayByPaypal payByPaypal = new PayByPaypal();
        PayByWireTransfer payByWireTransfer = new PayByWireTransfer();
        PayByCC payByCC = new PayByCC();

        // Processing payments using the paymentProcessor method
        paymentProcessor(payByCC, amount);
        paymentProcessor(payByWireTransfer, amount);
        paymentProcessor(payByPaypal, amount);
    }

    // Method to process payments using polymorphism
    static void paymentProcessor(Payments payments, double amount) {
        payments.pay(amount); // Calls the specific payment method's implementation
    }
}

// Interface representing payment methods
interface Payments {
    void pay(double amount); // Abstract method to be implemented by payment classes
}

// Class implementing Payments interface for PayPal
class PayByPaypal implements Payments {
    @Override
    public void pay(double amount) {
        // Implementation for PayPal payment
    }
}

// Class implementing Payments interface for Wire Transfer
class PayByWireTransfer implements Payments {
    @Override
    public void pay(double amount) {
        // Implementation for Wire Transfer payment
    }
}

// Class implementing Payments interface for Credit Card
class PayByCC implements Payments {
    @Override
    public void pay(double amount) {
        // Implementation for Credit Card payment
    }
}
