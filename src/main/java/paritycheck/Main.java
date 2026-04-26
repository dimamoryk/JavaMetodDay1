package paritycheck;

public class Main {

    public static boolean isEvan(int n) {
        return n % 2 == 0;
    }

    public static void main(String... args) {

        System.out.println(isEvan(10)); // true
        System.out.println(isEvan(7)); // false
    }
}
