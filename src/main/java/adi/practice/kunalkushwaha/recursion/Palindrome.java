package adi.practice.kunalkushwaha.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String originalString = "123321";
        System.out.println(originalString.equals(checkPalindrome(originalString)));
    }

    static String checkPalindrome(String originalString){
        if(originalString.length() <= 1)
            return originalString;
        return originalString.charAt(originalString.length() - 1) + checkPalindrome(originalString.substring(0,originalString.length() - 1));
    }
}
