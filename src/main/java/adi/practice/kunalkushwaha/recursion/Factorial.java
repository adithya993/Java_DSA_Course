package adi.practice.kunalkushwaha.recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(factorialNumbers(number));
    }

    public static int factorialNumbers(int number){
        if(number <= 1) {
            return 1;
        }
        return number * factorialNumbers(number - 1);
    }
}

