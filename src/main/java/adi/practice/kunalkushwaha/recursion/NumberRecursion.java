package adi.practice.kunalkushwaha.recursion;

public class NumberRecursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {

        if (n == 5) {
            System.out.println("Current number val: " + n);
            return;
        }

        System.out.println("Current number val: " + n);
        print(n + 1);
        System.out.println();

        /*
         * System.out.println("Current number val: " + n);
         * if (n != 5) {
         * print(n + 1);
         * }
         */
    }
}