package classes_with_attributes;

public class ProductManager {
    public void add(Product product) {
        // JDBC
        System.out.println("Product added : " + product.getName() + " " + product.getDescription());
    }

    public void add2(int id, String name, String description, double price, int stockAmount) {

    }
}
