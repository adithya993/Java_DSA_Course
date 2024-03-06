package adi.practice.kunalkushwaha.recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //print multiple permutations of given string
        String source = "abc";
        String response = "";
        permutation(response, source);
        System.out.println(permutationCount(response, source));
        System.out.println(permutationCountwithArgument(response, source, 0));
        System.out.println(permutationReturnArraylist(response, source));
    }

    private static void permutation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for(int  i = 0; i <= processed.length(); ++i){
            String firstString = processed.substring(0,i);
            String secondString = processed.substring(i);
            permutation(firstString + ch + secondString, unprocessed.substring(1));
        }
    }

    private static int permutationCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            return 1;
        }

        char ch = unprocessed.charAt(0);
        int count = 0;
        for(int  i = 0; i <= processed.length(); ++i){
            String firstString = processed.substring(0,i);
            String secondString = processed.substring(i);
            count = count + permutationCount(firstString + ch + secondString, unprocessed.substring(1));
        }
        return count;
    }

    private static int permutationCountwithArgument(String processed, String unprocessed, int count) {
        if (unprocessed.isEmpty()){
            return 1;
        }

        char ch = unprocessed.charAt(0);
        count = 0;
        for(int  i = 0; i <= processed.length(); ++i){

            String firstString = processed.substring(0,i);
            String secondString = processed.substring(i);
            count += permutationCountwithArgument(firstString + ch + secondString, unprocessed.substring(1), count);

        }
        return count;
    }

    private static ArrayList<String> permutationReturnArraylist(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            ArrayList<String> obj  = new ArrayList<>();
            obj.add(processed);
            return obj;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> result  = new ArrayList<>();
        for(int  i = 0; i <= processed.length(); ++i){
            String firstString = processed.substring(0,i);
            String secondString = processed.substring(i);
            result.addAll(permutationReturnArraylist(firstString + ch + secondString, unprocessed.substring(1)));
        }
        return result;
    }

}
