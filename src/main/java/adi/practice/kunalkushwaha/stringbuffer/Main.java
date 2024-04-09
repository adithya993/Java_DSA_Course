package adi.practice.kunalkushwaha.stringbuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer buffer1 = new StringBuffer();
        buffer1.append("Adithya Rengarajan");
        buffer1.append(" is nice");

        buffer1.insert(2, " Seetharaman");

        buffer1.replace(0, 5, "USHA ");
        buffer1.reverse();

        //constructor 2
        StringBuffer buffer2 = new StringBuffer("Adithya");

        //constructor 3
        StringBuffer buffer3 = new StringBuffer(30);

        String str = buffer1.toString();
        System.out.println(str);
        System.out.println(buffer2.capacity());

        String sent = " hi how r u doing";
        System.out.println(sent);
        System.out.println(sent.replaceAll("\\s",""));

        String rommies = " sujit,adithya,prithvi,nikil";
        System.out.println(Arrays.toString(rommies.split(",")));

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.29865));
    }
}
