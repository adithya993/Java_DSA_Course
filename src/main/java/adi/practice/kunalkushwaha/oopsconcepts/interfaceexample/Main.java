package adi.practice.kunalkushwaha.oopsconcepts.interfaceexample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.start();
        car.stop();
        Brake.brakeType();

        System.out.println("___________________________");

        NiceCar obj = new NiceCar();
        obj.start();
        obj.startMusic();
        obj.upgradeEngine(new ElectricEngine());
        obj.stop();
    }
}
