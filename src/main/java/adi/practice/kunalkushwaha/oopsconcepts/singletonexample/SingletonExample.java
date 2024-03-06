package adi.practice.kunalkushwaha.oopsconcepts.singletonexample;

public class SingletonExample {
    private SingletonExample(){
        SingletonExample.maxScore = 100;
    }

    private static int maxScore;
    private static SingletonExample instanceObject;

    public static int getMaxScore(){
        if(instanceObject == null){
            instanceObject = new SingletonExample();
        }
        return SingletonExample.maxScore;
    }
}
