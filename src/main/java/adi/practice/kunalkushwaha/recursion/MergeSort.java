package adi.practice.kunalkushwaha.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeSortedArrays(left,right);
    }

    private static int[] mergeSortedArrays(int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int itr = 0;
        int[] mergredSortedArray = new int[left.length+right.length];
        while(itr < left.length+right.length){
            if(rightIndex >= right.length || left[leftIndex]<right[rightIndex]){
                mergredSortedArray[itr] = left[leftIndex];
                leftIndex++;
            } else {
                mergredSortedArray[itr] = right[rightIndex];
                rightIndex++;
            }
            itr++;
        }
        return mergredSortedArray;
    }
}
