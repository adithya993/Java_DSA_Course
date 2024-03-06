package adi.practice.kunalkushwaha.recursion;

public class FindIfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 8, 9, 12};
        System.out.println(findSorted(arr,0));
    }

    static boolean findSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && findSorted(arr,index+1);
    }
}
