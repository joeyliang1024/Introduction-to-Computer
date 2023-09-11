package stu_108201017;
/**
 Practice 6
 Student numnber : 108201017
 Course : 2022-CE1004-B
 */
import java.util.Scanner;
import java.util.ArrayList;
public class P6_108201017 {
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> booklist = new ArrayList<String>();
        boolean exist = true;
        while(exist == true){
            String input = scanner.nextLine();
            if (input.equals("exist")){
                System.out.println(booklist);
                exist = false;
            }
            else if (input.equals("exist") == false){
                String input_array[] = input.split(" ");
                int index = Integer.parseInt(input_array[0]);
                int poisition = Integer.parseInt(input_array[1]);
                if(index == 1){//save book
                    booklist.add(poisition-1,input_array[2]);
                }
                if (index == 2){//take book
                    booklist.remove(poisition-1);
                }
            }
        }
        scanner.close();
    }
}

/**

 */