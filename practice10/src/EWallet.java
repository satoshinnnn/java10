public class EWallet extends PaymentMethod implements Payable {

    private String phoneNumber;
    private double balance;

    public EWallet(String accountName, String paymentId, String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if (amount<= balance) {
            balance += amount;
            System.out.println("Thanh toan thanh cong: " + amount);
            System.out.println("So du: " + balance);
        } else {
            System.out.println("Thanh toan that bai, khong du so du");
        }
    }

    @Override
    void validate() {
        if (phoneNumber.length() == 10) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
