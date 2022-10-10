package method_overloading;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        // normal method (first in that class)
        System.out.println(calculation.add(2, 3));
        // overloaded method
        System.out.println(calculation.add(2, 3, 4));
    }
}
