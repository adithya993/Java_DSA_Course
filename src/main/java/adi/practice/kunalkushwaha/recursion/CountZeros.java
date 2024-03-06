package adi.practice.kunalkushwaha.recursion;

public class CountZeros {
    public static void main(String[] args) {
        int originalNumber = 100;
        System.out.println(countZeroes(originalNumber));
        System.out.println(countZeroes_Method2(originalNumber,0));
    }

    static int countZeroes(int curNumber){
        if(curNumber < 10)
            return curNumber%10==0?1:0;
        return (curNumber%10==0?1:0) + countZeroes(curNumber/10);
    }

    static int countZeroes_Method2(int curNumber, int count){
        if(curNumber < 10)
            return curNumber%10==0?++count:count;

        return curNumber%10==0?countZeroes_Method2(curNumber/10,++count):countZeroes_Method2(curNumber/10,count);
    }
}
