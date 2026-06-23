import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Keyboard", "Electronics"),

                new Product(102, "Laptop", "Electronics"),

                new Product(103, "Mouse", "Electronics"),

                new Product(104, "Monitor", "Electronics"),

                new Product(105, "Printer", "Electronics")

        };

        System.out.println("===== Linear Search =====");

        Product linearResult =
                LinearSearch.search(products, "Monitor");

        if (linearResult != null) {

            System.out.println(linearResult);

        }

        else {

            System.out.println("Product Not Found");

        }

        Arrays.sort(products,
                Comparator.comparing(Product::getProductName));

        System.out.println("\n===== Binary Search =====");

        Product binaryResult =
                BinarySearch.search(products, "Monitor");

        if (binaryResult != null) {

            System.out.println(binaryResult);

        }

        else {

            System.out.println("Product Not Found");

        }

    }

}
