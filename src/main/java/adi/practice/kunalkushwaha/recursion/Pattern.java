package adi.practice.kunalkushwaha.recursion;

public class Pattern {
     public static void main(String[] args) {
        int totalRow = 5;
        triangleShape(totalRow,0);
        System.out.println();
        System.out.println();
        triangleShapeReverse(totalRow,0);
    }

    public static void triangleShape(int row, int col){
        if(row < 0){
            return;
        }

        if(col<row){
            triangleShape(row,col+1);
            System.out.print("* ");
        } else {
            triangleShape(row-1,0);
            System.out.println();
        }
    }

    public static void triangleShapeReverse(int row, int col){
        if(row < 0){
            return;
        }

        if(col<row){
            System.out.print("* ");
            triangleShapeReverse(row,col+1);
        } else {
            System.out.println();
            triangleShapeReverse(row-1,0);
        }
    }
}
