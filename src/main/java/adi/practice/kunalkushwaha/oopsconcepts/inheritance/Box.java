package adi.practice.kunalkushwaha.oopsconcepts.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    //create cube
    Box(double side){
        this.height = side;
        this.length = side;
        this.width = side;
    }

    Box(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    Box(Box box){
        this.height = box.height;
        this.length = box.length;
        this.width = box.width;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
