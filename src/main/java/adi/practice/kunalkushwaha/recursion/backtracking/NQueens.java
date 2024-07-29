package adi.practice.kunalkushwaha.recursion.backtracking;

import java.sql.SQLOutput;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            displayCurrentQueensPositions(board);
            System.out.println("####################");
            return 1;
        }
        int count = 0;

        for(int col = 0; col < board.length; ++col){
            if(isSafeToPlaceHere(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isSafeToPlaceHere(boolean[][] board, int row, int col){
        //case 1 - check vertically up in current column
        for(int i = 0; i < row; ++i){
            if(board[i][col]){
                return false;
            }
        }
        //case 2 - check right diagonal
        int rightRange = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= rightRange; ++i){
            if(board[row-i][col+i]){
                return false;
            }
        }
        //case 3 - check left diagonal
        int leftRange = Math.min(row, col);
        for(int i = 1; i <= leftRange; ++i){
            if(board[row-i][col-i]){
                return false;
            }
        }
        return true;
    }

    public static void displayCurrentQueensPositions(boolean[][] board){
        for(int i = 0; i < board.length; ++i){
            for(boolean indexVal : board[i]){
                if(indexVal){
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
