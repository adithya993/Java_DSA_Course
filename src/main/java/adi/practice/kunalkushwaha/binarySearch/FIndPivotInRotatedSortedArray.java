package adi.practice.kunalkushwaha.binarySearch;

import java.util.Arrays;

public class FIndPivotInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{4,5,6,0,1,2,3}) + " --> "+findPivotInRotatedSortedArray(new int[]{5,6,0,1,2,3,4}));
    }

    public static int findPivotInRotatedSortedArray(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            //case 1
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            //case 2
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            //case 3
            if(nums[start]>=nums[mid])
                end = mid-1;
            //case 4
            if(nums[start]<nums[mid])
                start = mid+1;
        }
        return -1;
    }
}
