/**
Assignment 2
Student numnber : 108201017
Course : 2022-CE1002
 */
import java.util.Scanner;
public class A2_108201017  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Integer str1 = scanner.nextInt();
        scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < str1; i++) {    
            for(int k = (str1-1); k > i; k--) {
                System.out.print(" ");
            }
            	System.out.print(str2.substring(0,1));
            for (int j = 0; j < i; j++) { 
                if (i==str1-1){System.out.print(str2.substring(0,1)+str2.substring(0,1));}
                else{System.out.print(str2.substring(1)+str2.substring(1));}
            }
            	System.out.print(str2.substring(0,1)+"\n");
        }
    }
}
