package Violated.OCP;

class PaymentProcessor {
    // Public function that processes payment depending on the payment method.
    // Every time you add a new payment method (e.g., "bankTransfer"), you need to modify this class, which violates OCP
    public void processPayment(String paymentMethod, double amount) {
    
        if (paymentMethod.equals("creditCard")) {
            System.out.println("Processing Credit card payment");

        } else if (paymentMethod.equals("paypal")) {
            System.out.println("Processing PayPal payment");

        }
    }
}
