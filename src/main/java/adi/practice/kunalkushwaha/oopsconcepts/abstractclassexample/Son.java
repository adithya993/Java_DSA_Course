package adi.practice.kunalkushwaha.oopsconcepts.abstractclassexample;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Agent Romanoff");
    }
}
