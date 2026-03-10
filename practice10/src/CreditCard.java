public class CreditCard extends PaymentMethod implements  Payable{

    private String cardNumber;   // 16 chữ số
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId, String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println("Thanh toan thanh cong: " + amount);
            System.out.println("So du: " + creditLimit);
        } else {
            System.out.println("Thanh toan that bai, khong du so du");
        }
    }

    @Override
    void validate() {
        if (cardNumber.length() == 16 ) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }

    }
}
