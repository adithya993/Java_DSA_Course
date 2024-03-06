package adi.practice.kunalkushwaha.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int number  = 1824;
        reverseNumber_Method1(number);
        System.out.println(sum);
        System.out.println(reverseNumber_Method2(number));
    }
    static int sum = 0;
    static void reverseNumber_Method1(int number){
        if(number==0)
            return;
        sum = sum*10 + number%10;
        reverseNumber_Method1(number/10);
    }

    static int reverseNumber_Method2(int number){
        int digitsInNumber = (int) (Math.log10(number)) + 1;
        if(number<10)
            return number;
        int subSum = (int)(number%10 * Math.pow(10,digitsInNumber-1));
        return subSum + reverseNumber_Method2(number/10);
    }
}
