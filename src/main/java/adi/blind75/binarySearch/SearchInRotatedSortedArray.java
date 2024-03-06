package adi.blind75.binarySearch;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{4,5,6,7,0,1,2}) + "," + 0 + " --> "+search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(Arrays.toString(new int[]{4,5,6,7,0,1,2}) + "," + 3 + " --> "+search(new int[]{4,5,6,7,0,1,2}, 3));
        System.out.println(Arrays.toString(new int[]{1}) + "," + 0 + " --> "+search(new int[]{1}, 0));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int pivotElementIndex = findPivotElement(nums,start,end);
        int targetIndex = -1;
        if(pivotElementIndex == -1){
            targetIndex = binarySearch(nums,start,end,target);
        } else {
            if(nums[pivotElementIndex] == target)
                targetIndex = pivotElementIndex;
            else {
                if(nums[start] <= target)
                    targetIndex = binarySearch(nums,start,pivotElementIndex-1,target);
                else
                    targetIndex = binarySearch(nums,pivotElementIndex+1,end,target);
            }
        }
        return targetIndex;
    }

    public static int binarySearch(int[] nums, int start, int end, int target){
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

    public static int findPivotElement(int[] nums, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            //case 1
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            //case 2
            if(mid> start && nums[mid]<nums[mid-1])
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
