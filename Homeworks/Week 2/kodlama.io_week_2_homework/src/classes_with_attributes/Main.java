package classes_with_attributes;

public class Main {
    public static void main(String[] args) {
        // if there is no Constructor with 0 parameters this will throw an error.
        Product product = new Product();

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Monster Huma");
        product.setPrice(13999.99);
        product.setStockAmount(3);
        // lets add color
        product.setColor("Black");

        ProductManager productManager = new ProductManager();

        productManager.add(product);
        System.out.println(product.getCode());

        Product product2 = new Product(2, "Laptop", "MSI Gaming", 18000, 3, "Red");

        productManager.add(product2);
        System.out.println(product2.getCode());

        // lets add a new attribute to Product class : Color attribute
        // if you use methods like below, in any update of product you need to update
        // every single of these methods. Because of that, add method is useful than
        // add2 method.
        // add method takes product's itself as parameter and no need to update in
        // usages of method.

        // productManager.add2(2, "Phone", "Apple", 35999, 250);
        // productManager.add2(2, "Phone", "Apple", 35999, 250);
        // productManager.add2(2, "Phone", "Apple", 35999, 250);
        // productManager.add2(2, "Phone", "Apple", 35999, 250);
        // productManager.add2(2, "Phone", "Apple", 35999, 250);
    }
}
