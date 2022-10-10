package youtube_demo3;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = new int[] { 1, 2, 3 };
        int[] numbers2 = new int[] { 10, 20, 30 };

        numbers1 = numbers2;

        numbers2[0] = 1000;

        System.out.println("numbers1[0] : " + numbers1[0]);
        System.out.println("numbers1[0] is changed with numbers2[0] because array is reference type");
    }
}
