package adi.practice.kunalkushwaha.recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,6,5,1,2};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,arr.length-1,1, 0);
    }

    public static void selectionSort(int[] arr, int row, int col, int min){
        if(row<1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(col<= arr.length-1){
            if(arr[col]<arr[min]){
                min=col;
            }
            selectionSort(arr,row,col+1,min);
        } else {
            int rr = arr.length-1-row;
            if(arr[rr]>arr[min]){
                int temp = arr[rr];
                arr[rr] = arr[min];
                arr[min] = temp;
            }
            selectionSort(arr,row-1,arr.length - (row-1), arr.length - (row-1)-1);
        }
    }
}
