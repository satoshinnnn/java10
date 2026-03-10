public class Main2 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("toyota");
        Car c2 = new Car("vinfast");
        Bicycle b1 = new Bicycle("shinchan");

        v1.move();
        c2.move();
        b1.move();
    }

}
