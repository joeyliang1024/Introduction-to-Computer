/**
Practice 2
Student numnber : 108201017
Course : 2022-CE1004-B
 */
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class P2_108201017 {
    public static void main(String args[]) throws IOException{
        //創建文件
        File file = new File("108201017.txt");
        file.createNewFile();// creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufw =  new BufferedWriter(writer);
        //讀取tset.txt
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        try{
            String line;
            while((line = br.readLine()) != null){
                System.out.print(line+"\n");
                bufw.write(line);//向文件寫入內容
                bufw.newLine();
            }
            bufw.flush();
            bufw.close();
            }
        catch(IOException e){
            System.out.println(e);
        }
        fr.close();
    }
}