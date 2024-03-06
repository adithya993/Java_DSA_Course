package adi.practice.kunalkushwaha.oopsconcepts.interfaceexample;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine start");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("PowerEngine accelerate");
    }
}
