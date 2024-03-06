package adi.practice.kunalkushwaha.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int number = 21;
        System.out.println(linearSearch(arr,0,number));
    }

    public static boolean linearSearch(int[] arr, int index, int target){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, index + 1, target);
    }
}
