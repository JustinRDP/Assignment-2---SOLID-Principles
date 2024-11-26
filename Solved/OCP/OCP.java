package Solved.OCP;

// Abstract class representing a generic payment method
abstract class PaymentMethod {
    // Public abstract method to be implemented by specific payment methods
    public abstract void processPayment(double amount);
}

// Class implementing payment processing via Credit Card
class CreditCardPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing Credit Card payment of " + amount);
    }
}

// Class implementing payment processing via PayPal
class PayPalPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing PayPal payment of " + amount);
    }
}

// Class responsible for processing payments
class PaymentProcessor {
    // Public method to process payments using a specific payment method
    public void process(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); // Delegates payment processing to the respective method
    }
}
