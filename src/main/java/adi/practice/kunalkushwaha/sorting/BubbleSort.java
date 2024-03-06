package adi.practice.kunalkushwaha.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; ++i) {
            boolean noMoreSwapping = true;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; ++j) {
                if (arr[j] < arr[j - 1]) {
                    noMoreSwapping = false;
                    swapElements(arr, j - 1, j);
                }
            }
            if (noMoreSwapping) {
                break;
            }
        }
    }

    static void swapElements(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
