package adi.practice.kunalkushwaha.oopsconcepts.inheritance;

public class Main {
    public static void main(String[] args) {
        //Default Constructor
        Box box = new Box();
        System.out.println(box.length + " " + box.width + " " + box.height);

        Box box1 = new Box(10);
        System.out.println(box1.length + " " + box1.width + " " + box1.height);

        Box box2 = new Box(3,4,5);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        //Copy Constructor
        Box box3 = new Box(box2);
        System.out.println(box3.length + " " + box3.width + " " + box3.height);


        Boxweight bw0 = new Boxweight();
        System.out.println(bw0.weight + " " + bw0.length + " " + bw0.width + " " + bw0.height);

        Boxweight bw1 = new Boxweight(4,3,5,12);
        System.out.println(bw1.weight + " " + bw1.length + " " + bw1.width + " " + bw1.height);

        // this example shows access available based on reference type and not the object type created
        Box box5 = new Boxweight(2,3,4,8);
        System.out.println(box5.length + " " + box5.width + " " + box5.height);

        // not allowed, as boxweight reference needs to init weight,
        // but the object is of type box
        //Boxweight bw2 = new Box(4,3,5);
        //System.out.println(bw2.weight + " " + bw2.length + " " + bw2.width + " " + bw2.height);
    }
}
