package adi.practice.kunalkushwaha.largenumbers.bigdecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BD();
    }

    public static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans);

        BigDecimal bx = new BigDecimal("0.03");
        BigDecimal by = new BigDecimal("0.04");
        BigDecimal bans = by.subtract(bx);
        System.out.println(bans);

        BigDecimal a = new BigDecimal("4562345245465446546.687165146514");
        BigDecimal b= new BigDecimal("165165161651.6584545454454");
        BigDecimal b0 = b.add(a);
        BigDecimal b1 = b.subtract(a);
        BigDecimal b3 = b.multiply(a);
        BigDecimal b4 = b.pow(2);
        BigDecimal b5 = b.negate();
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
