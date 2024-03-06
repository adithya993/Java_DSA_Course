package adi.practice.kunalkushwaha.recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,5,1,2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length,0);
    }

    public static void bubbleSort(int[] arr, int row, int col){
        if(row<0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(col<row-1){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr,row,col+1);
        } else {
            bubbleSort(arr,row-1,0);
        }
    }
}
