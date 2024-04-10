package adi.practice.kunalkushwaha.filehandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //create file
        try{
            File fo = new File("src/main/java/adi/practice/kunalkushwaha/filehandling/newFile.txt");
            fo.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        // write in file
        try(FileWriter fw = new FileWriter("src/main/java/adi/practice/kunalkushwaha/filehandling/newFile.txt", true)){
            fw.write(" Checking write basics.");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        // read from file
        try{
            BufferedReader bfr = new BufferedReader(new FileReader("src/main/java/adi/practice/kunalkushwaha/filehandling/newFile.txt"));
            while(bfr.ready()){
                System.out.println(bfr.readLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        //delete a file
        try{
            File fo = new File("src/main/java/adi/practice/kunalkushwaha/filehandling/randomdel.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
