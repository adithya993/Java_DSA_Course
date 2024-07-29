package adi.practice.kunalkushwaha.oopsconcepts.inheritance;

public class Boxweight extends Box{
    double weight;
    public Boxweight(){
        this.weight = -1;
    }
    public Boxweight(double height, double length, double width, double weight) {
        super(height, length, width);
        System.out.println(this.height);
        System.out.println(super.height);
        this.weight = weight;
    }

    Boxweight (Boxweight other){
        super(other);// similar to writing it as 'Box box5 = new Boxweight(2,3,4,8);'
        weight = other.weight;
    }

}
