package adi.blind75.twoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String[] strArray = {"A man, a plan, a canal: Panama", "race a car", " "};
        for(String s : strArray){
            System.out.println("\""+s+"\" --> "+checkValidPalindrome(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()));
        }
    }

    public static boolean checkValidPalindrome(String s){
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        while(leftIndex<=rightIndex){
            if(s.charAt(leftIndex)!=s.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
