package adi.practice.kunalkushwaha.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{0,1,2,4,5,6,7}) + "," + 1 + " --> "+binarySearch(new int[]{0,1,2,4,5,6,7}, 1));
    }

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>nums[mid])
                start = mid+1;
            else if (target<nums[mid])
                end = mid-1;
            else
                return mid;
        }
        return -1;
    }
}
