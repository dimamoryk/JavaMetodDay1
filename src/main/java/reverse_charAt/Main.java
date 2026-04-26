package reverse_charAt;

public class Main {
    public static String reverseString(String s) {
        if (s == null) return null;
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String... args) {
        System.out.println(reverseString("hello")); // "olleh"
    }
}
