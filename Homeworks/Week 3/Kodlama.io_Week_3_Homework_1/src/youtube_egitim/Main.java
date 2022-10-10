package youtube_egitim;

public class Main {
    public static void main(String[] args) throws Exception {

        int number1 = 10;
        int number2 = 20;

        number1 = number2;
        number2 = 100;

        System.out.println("number 1 :" + number1);
        System.out.println("Number 1 is not changed to 100 because int type is value type");
        System.out.println("number 2 :" + number2);
    }
}
