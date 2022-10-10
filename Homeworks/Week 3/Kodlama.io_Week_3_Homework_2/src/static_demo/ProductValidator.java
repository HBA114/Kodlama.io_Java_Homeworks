package static_demo;

public class ProductValidator {

    static {
        System.out.println("Static Constructor");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }

    public void something(){
        System.out.println("Something");
    }
}
