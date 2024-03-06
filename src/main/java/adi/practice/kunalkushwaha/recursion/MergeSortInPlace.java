package adi.practice.kunalkushwaha.recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        //mergeSortInPlace(arr, 0, arr.length);
        inSortMerging(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void inSortMerging(int[] arr, int start, int end){
        if(start==end){
            return;
        }

        int middle = start + (end - start) / 2;

        inSortMerging(arr, start, middle);
        inSortMerging(arr, middle + 1, end);

        inSortMergeSorting(arr, start, middle, end);
    }

    private static void inSortMergeSorting(int[] arr, int start, int middle, int end) {
        int leftBucketSize = middle-start+1;
        int rightBucketSize = end-middle;

        int[] merge = new int[leftBucketSize + rightBucketSize];

        int i = start;
        int j = middle + 1;
        int k = 0;

        ///*
        while(i <= middle && j <= end){
            if(arr[i]<arr[j]){
                merge[k] = arr[i];
                i++;
            } else {
                merge[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=middle){
            merge[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end){
            merge[k] = arr[j];
            j++;
            k++;
        }
        //*/

        /*
        while(i < start + leftBucketSize && j < middle + 1 + rightBucketSize){
            if(arr[i]<arr[j]){
                merge[k] = arr[i];
                i++;
            } else {
                merge[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < start + leftBucketSize){
            merge[k] = arr[i];
            i++;
            k++;
        }
        while(j < middle + 1 + rightBucketSize){
            merge[k] = arr[j];
            j++;
            k++;
        }
        //*/

        for(int p = 0; p < merge.length; p++){
            arr[start+p] = merge[p];
        }

    }















    public static void mergeSortInPlace(int[] arr,int startIndex, int endIndex){
        if(endIndex-startIndex == 1){
            return;
        }

        int mid = startIndex + (endIndex-startIndex)/2;

        mergeSortInPlace(arr, startIndex, mid);
        mergeSortInPlace(arr, mid, endIndex);

        mergeInPlace(arr, startIndex, mid, endIndex);
    }

    private static void mergeInPlace(int[] arr, int startIndex, int mid, int endIndex) {
        int[] mergredTmpArray = new int[endIndex-startIndex];

        int i = startIndex;
        int j = mid;
        int itr = 0;

        while(i < mid && j < endIndex){
            if(arr[i] < arr[j]){
                mergredTmpArray[itr] = arr[i];
                i++;
            } else {
                mergredTmpArray[itr] = arr[j];
                j++;
            }
            itr++;
        }

        while(i<mid){
            mergredTmpArray[itr] = arr[i];
            i++;
            itr++;
        }

        while(j<endIndex){
            mergredTmpArray[itr] = arr[j];
            j++;
            itr++;
        }

        for(int ij = 0; ij < mergredTmpArray.length; ++ij){
            arr[startIndex+ij]=mergredTmpArray[ij];
        }

        /*while(itr <= endIndex-startIndex){
            if(rightIndex > endIndex || arr[leftIndex]<arr[rightIndex]){
                mergredTmpArray[itr] = arr[leftIndex];
                leftIndex++;
            } else {
                mergredTmpArray[itr] = arr[rightIndex];
                rightIndex++;
            }
            itr++;
        }*/

    }
}

