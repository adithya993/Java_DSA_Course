package adi.blind75.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{2,7,11,15}) + "," + 9 + " --> "+Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(new int[]{3,2,4}) + "," + 6 + " --> "+Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(new int[]{3,3}) + "," + 6 + " --> "+Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> obj = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(obj.containsKey(target - nums[i])){
                return new int[] { obj.get(target - nums[i]), i};
            } else {
                obj.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
