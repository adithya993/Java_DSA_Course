package adi.practice.kunalkushwaha.oopsconcepts.interfaceexample;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine start");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricEngine accelerate");
    }
}
