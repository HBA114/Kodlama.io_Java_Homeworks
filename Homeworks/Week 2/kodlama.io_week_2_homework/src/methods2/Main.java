package methods2;

public class Main {
    public static void main(String[] args) {
        String message = "Today weather is beautiful.";
        message.substring(0, 2);
        String newMessage = giveCity();
        System.out.println(newMessage);

        int number = sum(10, 25);

        System.out.println(number);

        int sum = sumNumbers(1, 2, 3, 4, 5, 6);

        System.out.println(sum);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static String giveCity() {
        return "Konya";
    }

    // numbers is an int array here
    public static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
