package adi.practice.kunalkushwaha.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        // System.out.println(Arrays.toString(arr));
        // selectionSort(arr);
        // System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        selectionSortJennyAproach(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSortJennyAproach(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swapElements(arr, i, min);
            }
        }

        // always used simple method
        /*
         * for(int i = 0; i<arr.length;i++){
         * for(int j = i+1; j<arr.length;j++){
         * if(arr[j]<arr[i]){
         * int temp = arr[i];
         * arr[i] = arr[j];
         * arr[j] = temp;
         * }
         * }
         * }
         */
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapElements(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; ++i) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swapElements(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}