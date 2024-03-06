package adi.practice.kunalkushwaha.recursion;

import java.util.ArrayList;

public class SubSequencesInString {
    public static void main(String[] args) {
        subSequencesInString("abc", "");
        ArrayList<String> result = subSequencesInString2("abc", "");
        System.out.println(result);
    }

    public static void subSequencesInString(String source, String subStrings) {
        if (source.isEmpty()) {
            System.out.println(subStrings);
            return;
        }

        char ch = source.charAt(0);
        subSequencesInString(source.substring(1), subStrings + ch);
        subSequencesInString(source.substring(1), subStrings);
    }

    public static ArrayList<String> subSequencesInString2(String source, String subStrings) {
        if (source.isEmpty()) {
            ArrayList<String> obj = new ArrayList<>();
            obj.add(subStrings);
            return obj;
        }

        char ch = source.charAt(0);
        ArrayList<String> left = subSequencesInString2(source.substring(1), subStrings + ch);
        ArrayList<String> right = subSequencesInString2(source.substring(1), subStrings);
        left.addAll(right);
        return left;
    }
}
