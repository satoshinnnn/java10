public class Main {
    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(
                "Alice",
                "CC001",
                "1234567812345678",
                "123",
                5000
        );

        EWallet w1 = new EWallet(
                "Bob",
                "EW001",
                "0987654321",
                2000
        );

        c1.validate();
        c1.pay(200);

        w1.validate();
        w1.pay(200);

        Payable rewardPoints = new Payable() {
            @Override
            public void pay(double amount) {
                double point = amount/1000;
                System.out.print("Thanh toan thanh cong: " + point + " diem");
            }
        };

        rewardPoints.pay(5000);
    }
}
