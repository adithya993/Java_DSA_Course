package adi.practice.kunalkushwaha.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1342;
        System.out.println(sumOfDigitsInNumber(number));
    }

    public static int sumOfDigitsInNumber(int number){
        if(number < 10) {
            return number;
        }
        return number % 10 + sumOfDigitsInNumber(number/10);
    }
}
