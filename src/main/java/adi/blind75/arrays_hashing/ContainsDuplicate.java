package adi.blind75.arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[][] strArray = {{1,2,3,1}, {1,2,3,4}, {1,1,1,3,3,4,3,2,4,2}};
        for(int[] s : strArray){
            System.out.println(Arrays.toString(s) +" --> "+containsDuplicate(s));
        }
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            } else {
                uniqueNums.add(num);
            }
        }
        return false;
    }
}
