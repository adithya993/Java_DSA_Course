package adi.practice.kunalkushwaha.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int[] arr = { 3, 1, 5, 4, 2 };
        int[] arr = { 5, 4, 10, 1, 6, 2 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        /*
         * for (int i = 0; i < arr.length - 1; ++i) {
         * for (int j = i + 1; j > 0; --j) {
         * if (arr[j] < arr[j - 1]) {
         * swapElements(arr, j - 1, j);
         * } else {
         * break;
         * }
         * }
         * }
         */
        for (int i = 1; i < arr.length; ++i) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void swapElements(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}