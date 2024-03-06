package adi.practice.kunalkushwaha.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        System.out.println(binarySearch(arr, 78, 0, arr.length));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        int index = -1;
        if (start > end) {
            return index;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            index = binarySearch(arr, target, start, mid - 1);
        } else {
            index = binarySearch(arr, target, mid + 1, end);
        }
        return index;
    }
}
