package adi.practice.kunalkushwaha.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output {
    public static void main(String[] args) {
        //outputexample1();
        //outputexample2();
        outputexample3();
    }

    private static void outputexample3() {
        try(BufferedWriter bfw = new BufferedWriter(new FileWriter("src/main/java/adi/practice/kunalkushwaha/filehandling/note.txt", true))){
            bfw.write(" This is with buffered writer.");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void outputexample2() {
        try(FileWriter fw = new FileWriter("src/main/java/adi/practice/kunalkushwaha/filehandling/note.txt", true)){
            fw.write(" Checking write basics.");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void outputexample1() {
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Start here: Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
