package adi.practice.kunalkushwaha.stringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        int start = 0;
        // String str = "malayalam";
        String str = "a";
        String res = "Is a Palindrome";
        for (start = 0; start < str.length() / 2; start++) {
            System.out.printf("comparing %s and %s:%n", start, str.length() - start - 1);
            if (str.charAt(start) != str.charAt(str.length() - start - 1)) {
                res = "Not a Palindrome";
                break;
            }
        }
        System.out.println(res);
    }
}
