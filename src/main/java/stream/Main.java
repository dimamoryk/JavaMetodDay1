package stream;

public class Main {
    public static int countVowels(String s) {
        if (s == null) return 0;
        return (int) s.toLowerCase().chars()
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'c' || c == 'u')
                .count();
    }

    public static void main(String... args) {
        System.out.println(countVowels("Hello World")); // 3
    }
}
