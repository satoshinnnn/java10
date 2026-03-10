import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 1200));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));
        products.add(new Product("Camera", 500));

        // Anonymous Class phải override method compare
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.price, o2.price);
            }
        });

        System.out.println("Sort by price (Anonymous Class):");
        for (Product p : products) {
            System.out.println(p);
        }

        //Lambda expression
        Collections.sort(products, (o1,o2) -> o1.name.compareTo(o2.name));

        System.out.println("\nSort by name (Lambda Expression):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
