package maxwithif;

public class Main {

    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String... args) {
        System.out.println(maxOfThree(5, 9, 3));
    }
}
