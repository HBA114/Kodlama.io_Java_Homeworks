package methods;

// class names in Java should written in PascalCase
public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    // method names in Java should written in camelCase
    public static void findNumber() {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int find = 7;
        boolean isContains = false;

        for (int number : numbers) {
            if (number == find) {
                isContains = true;
                break;
            }
        }

        String message = "";
        if (isContains) {
            message = "Numbers array contains : " + find;
            giveMessage(message);
        } else {
            giveMessage("Numbers array is not contains : " + find);
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }
}
