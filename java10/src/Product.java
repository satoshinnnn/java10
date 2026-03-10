public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Phương thức hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
