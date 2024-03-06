package adi.practice.kunalkushwaha.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSet(arr));
        int[] arr2 = {1,2,3,2};
        System.out.println(subSetWithDuplicates(arr2));
    }

    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums : arr){
            int outerSize = outer.size();
            for(int i = 0; i < outerSize; ++i){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSetWithDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            start = 0;
            if( i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size()-1;
            int outerSize = outer.size();
            for(int j = start; j < outerSize; ++j){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
