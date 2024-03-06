package adi.practice.kunalkushwaha.binarySearch;
import java.util.Arrays;

public class BinarySearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(binarySearchInSortedMatrix(arr, 6)));
    }

    static int[] binarySearchInSortedMatrix(int[][] arr, int target) {
        int row = arr.length;
        int column = arr[0].length;

        if (row == 1) {
            return simpleBinarySearch(arr, 0, 0, column - 1, target);
        }

        // run the loop till 2 rows are remaining
        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = column / 2;

        while (rowStart < (rowEnd - 1)) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            if (arr[rowMid][colMid] == target)
                return new int[] { rowMid, colMid };
            else if (arr[rowMid][colMid] > target)
                rowEnd = rowMid;
            else
                rowStart = rowMid;
        }
        // now we have 2 rows
        // check whether the target is in the column of 2 rows
        if (arr[rowStart][colMid] == target)
            return new int[] { rowStart, colMid };
        else if (arr[rowStart + 1][colMid] == target)
            return new int[] { rowStart + 1, colMid };

        // search in remaining 4 segments
        // 1st segment:
        if (target <= arr[rowStart][colMid - 1]) {
            return simpleBinarySearch(arr, rowStart, 0, colMid - 1, target);
        }
        // 2nd segment:
        if (target >= arr[rowStart][colMid + 1] && target <= arr[rowStart][column - 1]) {
            return simpleBinarySearch(arr, rowStart, colMid + 1, column - 1, target);
        }
        // 3rd segment:
        if (target <= arr[rowStart + 1][colMid - 1]) {
            return simpleBinarySearch(arr, rowStart + 1, 0, colMid - 1, target);
        }
        // 4th segment:
        if (target >= arr[rowStart + 1][colMid + 1] && target <= arr[rowStart + 1][column - 1]) {
            return simpleBinarySearch(arr, rowStart + 1, colMid + 1, column - 1, target);
        }

        return new int[] { -1, -1 };
    }

    static int[] simpleBinarySearch(int[][] subArr, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int colMid = colStart + (colEnd - colStart) / 2;
            if (subArr[row][colMid] == target)
                return new int[] { row, colMid };
            else if (subArr[row][colMid] > target)
                colEnd = colMid - 1;
            else
                colStart = colMid + 1;
        }
        return new int[] { -1, -1 };
    }

}
