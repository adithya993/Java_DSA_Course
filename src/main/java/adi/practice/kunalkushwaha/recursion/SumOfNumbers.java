package adi.practice.kunalkushwaha.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(sumNumbers(number));
    }

    public static int sumNumbers(int number){
        if(number <= 1) {
            return 1;
        }
        return number + sumNumbers(number - 1);
    }
}

