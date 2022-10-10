package overriding;

public class BaseCreditManager {
    // public final double method // not overridable
    public double calculate(double amount) {
        return amount * 1.18;
    }
}
