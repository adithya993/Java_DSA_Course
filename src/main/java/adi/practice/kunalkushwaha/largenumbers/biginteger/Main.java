package adi.practice.kunalkushwaha.largenumbers.biginteger;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a  = 30, b = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger AA = BigInteger.valueOf(67);
        BigInteger B = BigInteger.valueOf(345678976);
        BigInteger C = new BigInteger("345678976654143651654643521654");

        //addition
        BigInteger s1 = A.add(AA);
        BigInteger sub = C.subtract(B);
        BigInteger div = C.divide(B);
        BigInteger rem = C.remainder(B);
        System.out.println(s1);
        System.out.println(C);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(rem);

        if(C.compareTo(B)<0){ //checking if C is smaller than B
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
