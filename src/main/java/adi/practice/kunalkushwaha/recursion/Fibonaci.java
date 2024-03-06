package adi.practice.kunalkushwaha.recursion;

public class Fibonaci {
    public static void main(String[] args) {
        System.out.println(fibonacii(7));
    }

    public static int fibonacii(int n) {
        // base condition
        if (n < 2) {
            return n;
        }

        return fibonacii(n - 1) + fibonacii(n - 2);
    }
}
