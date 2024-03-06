package adi.blind75.arrays_hashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String[][] strArray = {{"anagram","nagaram"}, {"rat","car"}};
        for(String[] s : strArray){
            System.out.println(Arrays.toString(s) +" --> "+isAnangram(s[0], s[1]));
        }
    }

    public static boolean isAnangram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] charArr = new int[26];
        for(int ch = 0; ch < s.length(); ++ch){
            charArr[s.charAt(ch) - 'a']++;
            charArr[t.charAt(ch) - 'a']--;
        }
        for(int n : charArr){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
