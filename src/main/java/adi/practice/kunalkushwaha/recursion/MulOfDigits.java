package adi.practice.kunalkushwaha.recursion;

public class MulOfDigits {
    public static void main(String[] args) {
        int number = 55;
        System.out.println(mulOfDigitsInNumber(number));
    }

    public static int mulOfDigitsInNumber(int number){
        if(number < 10) {
            return number;
        }
        return number % 10 * mulOfDigitsInNumber(number/10);
    }
}
