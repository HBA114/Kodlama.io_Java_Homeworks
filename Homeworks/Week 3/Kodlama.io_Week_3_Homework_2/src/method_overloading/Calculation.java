package method_overloading;

public class Calculation {
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    // method overloaded
    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
