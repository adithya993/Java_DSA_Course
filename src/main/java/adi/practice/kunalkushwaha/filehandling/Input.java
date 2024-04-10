package adi.practice.kunalkushwaha.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {
        //inputexample1();
        //inputexample2();
        //inputexample3();
        //inputexample4();
    }

    private static void inputexample4() {
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/adi/practice/kunalkushwaha/filehandling/note.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void inputexample3() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void inputexample2() {
        try(FileReader fr = new FileReader("src/main/java/adi/practice/kunalkushwaha/filehandling/note.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
            // fr.close(); not required, as it will be automatically closed
            System.out.println();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void inputexample1() {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            // isr.close(); not required, as it will be automatically closed
            System.out.println();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
