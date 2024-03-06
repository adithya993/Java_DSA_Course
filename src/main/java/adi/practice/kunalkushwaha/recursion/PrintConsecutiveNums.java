package adi.practice.kunalkushwaha.recursion;

public class PrintConsecutiveNums {
    public static void main(String[] args) {
        int number = 10;
        printConsecutiveNumbers(number);
        System.out.println("------------------------------------");
        printConsecutiveNumbersInReverse(number);
        System.out.println("------------------------------------");
        printConsecutiveNumbersBothDirection(number);
    }

    public static void printConsecutiveNumbers(int number){
        if(number == 0) {
            return;
        }
        printConsecutiveNumbers(number - 1);
        System.out.println(number);
    }

    public static void printConsecutiveNumbersInReverse(int number){
        if(number == 0) {
            return;
        }
        System.out.println(number);
        printConsecutiveNumbersInReverse(number - 1);
    }

    public static void printConsecutiveNumbersBothDirection(int number){
        if(number == 0) {
            return;
        }
        System.out.println(number);
        printConsecutiveNumbersBothDirection(number - 1);
        System.out.println(number);
    }
}
