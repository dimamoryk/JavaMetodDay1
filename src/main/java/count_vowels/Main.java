package count_vowels;

public class Main {

    public static int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String... args) {
        System.out.println(countVowels("Hello World")); // 3
    }
}
