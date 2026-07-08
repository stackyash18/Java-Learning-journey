abstract class Payment {

    protected String transactionId;

    public Payment(String transactionId) {
        this.transactionId = transactionId;
    }

    // Implemented Abstract method
    abstract void pay(double amount);

    // Common method shared by all payments
    void generateReceipt(double amount) {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Payment Successful");
        System.out.println("--------------------------");
    }
}

// UPI Payment
class UPIPayment extends Payment {

    private String upiId;

    public UPIPayment(String transactionId, String upiId) {
        super(transactionId);
        this.upiId = upiId;
    }

    @Override
    void pay(double amount) {
        System.out.println("Processing UPI Payment via ID: " + upiId);
        generateReceipt(amount);
    }
}

// Credit Card Payment
class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(String transactionId, String cardNumber) {
        super(transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay(double amount) {
        System.out.println("Processing Credit Card Payment using Card Number: " + cardNumber);
        generateReceipt(amount);
    }
}

// Net-Banking Payment
class NetBankingPayment extends Payment {
    private String userId;

    public NetBankingPayment(String transactionId, String userId) {
        super(transactionId);
        this.userId = userId;
    }

    @Override
    void pay(double amount) {
        System.out.println("Processing Net Banking Payment using Using UserID: " + userId);
        generateReceipt(amount);
    }
}

// Main class
public class PaymentApp {

    public static void main(String[] args) {

        Payment upi = new UPIPayment("TXN1001", "yash@upi");
        Payment card = new CreditCardPayment("TXN1002", "1234-5678-9012-3456");
        Payment net = new NetBankingPayment("TXN1002", "Yash18");

        upi.pay(1500);
        card.pay(5000);
        net.pay(80000);
    }
}