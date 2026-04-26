package maxofthree;

public class Main {

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String... args) {
        System.out.println(maxOfThree(5, 9, 3)); // 9
    }
}
