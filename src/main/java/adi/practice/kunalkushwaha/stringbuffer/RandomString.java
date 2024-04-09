package adi.practice.kunalkushwaha.stringbuffer;

import java.util.Random;

public class RandomString {
    public static String generate(int size){
        StringBuffer sb = new StringBuffer(size);
        Random rdm = new Random();
        while(size>0){
            int randomChar = 97 + (int)(rdm.nextFloat() * 26);
            char ch = (char) randomChar;
            sb.append(ch);
            size--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(20));
    }
}
