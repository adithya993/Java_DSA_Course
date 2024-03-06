package adi.blind75.binarySearch;

import java.util.Arrays;

public class FindMinRotatedSortedArray {
    public static void main(String[] args) {
        int[][] strArray = {{3,4,5,1,2}, {4,5,6,7,0,1,2},{11,13,15,17}};
        for(int[] s : strArray){
            System.out.println(Arrays.toString(s) +" --> "+findMin(s));
        }
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start<=end){
            if (nums[start] <= nums[end]) {
                return nums[start];
            }
            int mid = start + (end-start)/2;
            if(nums[mid]>=nums[start]){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return 0;
    }
}
