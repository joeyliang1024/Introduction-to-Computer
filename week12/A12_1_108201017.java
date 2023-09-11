package stu_108201017;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A12_1_108201017 {
    public static void main(String[] args) throws IOException {
        File f = new File("A12_108201017_1.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        BufferedWriter bufw = new BufferedWriter(fw);
        try {
            java.net.URL url = new java.net.URL("https://www.csie.ncu.edu.tw/");
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext()){
                String line = input.nextLine();
                bufw.write(line);
                bufw.newLine();
            }
            bufw.flush();
            bufw.close();
        }
        catch(java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch(java.io.IOException ex){
            System.out.println("IO Errors");
        }
    }
}
