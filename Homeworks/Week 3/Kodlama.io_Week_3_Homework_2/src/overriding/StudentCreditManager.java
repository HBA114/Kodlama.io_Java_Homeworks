package overriding;

public class StudentCreditManager extends BaseCreditManager {
    // credit interest can 1.10 max

    // Overrides calculate method in BaseCreditManager
    @Override
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
