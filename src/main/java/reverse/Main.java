package reverse;

public class Main {

    public static String reverseString(String s) {
        if (s == null) return null;
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String... args) {
        System.out.println(reverseString("hello")); // olleh
    }
}
