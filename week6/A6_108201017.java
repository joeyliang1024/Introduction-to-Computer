package a6_108201017;
import java.util.Scanner;
import java.util.Vector;
public class A6_108201017  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vector<Transaction> Overview = new Vector<Transaction>();
        while (true){
            Transaction transaction = new Transaction("",0,0);
            int choose = scanner.nextInt();
            int total = 0;
            if (choose == 4){break;}
            else if(choose == 1){
                String name = scanner.next();
                int income = scanner.nextInt();
                transaction.Name = name;
                transaction.Income = income;
                transaction.Pay = 0;
                Overview.add(transaction);
            }
            else if(choose == 2){
                String name = scanner.next();
                int pay = scanner.nextInt();
                transaction.Name = name;
                transaction.Income = 0;
                transaction.Pay = pay;
                Overview.add(transaction);
            }
            else if(choose == 3){
                int i = 0;
                while( i < Overview.size() ){
                    int j = 0;
                    int length_name = 0;
                    int length_income = 0;
                    while(j < Overview.size()){    
                        if(length_name < Overview.elementAt(j).Name.length()){
                            length_name = Overview.elementAt(j).Name.length();
                        }
                        String temp = Integer.toString(Overview.elementAt(j).Income);
                        if(length_income < temp.length()){
                            length_income = temp.length();
                        }
                        j++;
                    }
                    System.out.print(Overview.elementAt(i).Name);
                    for(int k=0;k<length_name+2-Overview.elementAt(i).Name.length();k++){
                        System.out.print(" ");
                    }
                    System.out.print(Overview.elementAt(i).Income);
                    int temp2 = Integer.toString(Overview.elementAt(i).Income).length();
                    for(int k=0;k<length_income+2-temp2;k++){
                        System.out.print(" ");
                    }
                    System.out.print(Overview.elementAt(i).Pay);
                    total = total - Overview.elementAt(i).Income + Overview.elementAt(i).Pay;
                    System.out.println();
                    i++;
                }               
                System.out.println("total: "+total);
            }
            else{
                System.out.println("Invalid Operation");
            }
        }
        scanner.close();
    }
}
