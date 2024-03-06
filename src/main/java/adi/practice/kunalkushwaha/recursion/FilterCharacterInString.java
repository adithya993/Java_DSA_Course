package adi.practice.kunalkushwaha.recursion;

import org.w3c.dom.ls.LSOutput;

public class FilterCharacterInString {
    public static void main(String[] args) {
        String originalString = "baccappled";
        System.out.println(filterCharacterInString(originalString));
        System.out.println(skipWordInString(originalString,"apple"));
        System.out.println(skippartialWordInString(originalString,"app", "apple"));
    }

    public static String filterCharacterInString(String originalString){
        if(originalString.isEmpty()){
            return "";
        }
        String tmp = "";
        if(originalString.charAt(0) != 'a'){
            tmp = String.valueOf(originalString.charAt(0));
        }
        return tmp + filterCharacterInString(originalString.substring(1));
    }

    public static String skipWordInString(String originalString, String searchString){
        if(originalString.isEmpty()){
            return "";
        }

        if(originalString.startsWith(searchString)){
            return skipWordInString(originalString.substring(searchString.length()),searchString);
        } else {
            return originalString.charAt(0) + skipWordInString(originalString.substring(1),searchString);
        }
    }

    public static String skippartialWordInString(String originalString, String searchString, String skipWord){
        if(originalString.isEmpty()){
            return "";
        }

        if(originalString.startsWith(searchString) && !originalString.startsWith(skipWord)){
            return skippartialWordInString(originalString.substring(searchString.length()),searchString,skipWord);
        } else {
            return originalString.charAt(0) + skippartialWordInString(originalString.substring(1),searchString,skipWord);
        }
    }
}
