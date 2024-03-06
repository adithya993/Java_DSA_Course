package adi.practice.kunalkushwaha.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int lowerBound, int upperBound){
        if(lowerBound >= upperBound){
            return;
        }

        int start = lowerBound;
        int end = upperBound;
        int middle = start + (end - start) / 2;
        int pivot = arr[middle];

        while (start <= end){

            while(arr[start]<pivot){
                start++;
            }

            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        /*int temp = arr[end];
        arr[end] = arr[middle];
        arr[middle] = temp;*/

        quickSort(arr, lowerBound, end);
        quickSort(arr, start, upperBound);

    }
}
