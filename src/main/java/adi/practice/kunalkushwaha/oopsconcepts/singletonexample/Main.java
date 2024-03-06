package adi.practice.kunalkushwaha.oopsconcepts.singletonexample;

public class Main {
    public static void main(String[] args) {
        int myScore1 = 87;
        findTotalScore(myScore1);
        int myScore2 = 33;
        findTotalScore(myScore2);
    }

    public static void findTotalScore(int myScore) {
        System.out.println(myScore + SingletonExample.getMaxScore());
    }
}
