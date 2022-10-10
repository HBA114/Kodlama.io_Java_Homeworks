package classes;

public class Main {
    public static void main(String[] args) {

        // reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;

        customerManager.add();
        customerManager.delete();
        customerManager.update();

        // value type
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;

        System.out.println(number2);

        // arrays are reference types
        int[] numbers = new int[] { 1, 2, 3 };
        int[] numbers2 = new int[] { 4, 5, 6 };

        numbers2 = numbers;
        numbers[0] = 10;

        System.out.println(numbers2[0]);
    }
}