package stu_108201017;

import java.util.ArrayList;
import java.util.Scanner;
public class A10_108201017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = true;
        ArrayList<String> drink_list = new ArrayList<String>();
        ArrayList<Integer> price_list = new ArrayList<Integer>();
        ArrayList<Integer> count_list = new ArrayList<Integer>(){
            {
                add(0);
                add(0);
                add(0);
                add(0);
            }
        };
        while(finish){
            System.out.println("(1)choose drinks (2)list (3)pay (4)exit");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("choose drinks (drinks / amount)\n(1)Cola (2)Green Tea (3)Lemon Tea (4)Mineral Water");
                    int drink = scanner.nextInt();
                    int count = scanner.nextInt();
                    if(1 <= count && count <= 100){
                        switch (drink){
                            case 1:
                                if(drink_list.contains("Cola")){
                                    count_list.set(drink_list.indexOf("Cola"),count_list.get(drink_list.indexOf("Cola"))+count);
                                }
                                else{
                                    drink_list.add("Cola");
                                    count_list.set(drink_list.indexOf("Cola"),count_list.get(drink_list.indexOf("Cola"))+count);
                                    price_list.add(30);
                                }
                                break;
                            case 2:
                                if(drink_list.contains("Green Tea")){
                                    count_list.set(drink_list.indexOf("Green Tea"),count_list.get(drink_list.indexOf("Green Tea"))+count);
                                }
                                else{
                                    drink_list.add("Green Tea");
                                    count_list.set(drink_list.indexOf("Green Tea"),count_list.get(drink_list.indexOf("Green Tea"))+count);
                                    price_list.add(25);
                                }
                                break;
                            case 3:
                                if(drink_list.contains("Lemon Tea")){
                                    count_list.set(drink_list.indexOf("Lemon Tea"),count_list.get(drink_list.indexOf("Lemon Tea"))+count);
                                }
                                else{
                                    drink_list.add("Lemon Tea");
                                    count_list.set(drink_list.indexOf("Lemon Tea"),count_list.get(drink_list.indexOf("Lemon Tea"))+count);
                                    price_list.add(29);
                                }
                                break;
                            case 4:
                                if(drink_list.contains("Mineral Water")){
                                    count_list.set(drink_list.indexOf("Mineral Water"),count_list.get(drink_list.indexOf("Mineral Water"))+count);
                                }
                                else{
                                    drink_list.add("Mineral Water");
                                    count_list.set(drink_list.indexOf("Mineral Water"),count_list.get(drink_list.indexOf("Mineral Water"))+count);
                                    price_list.add(20);
                                }
                                break;
                            default:
                                System.out.println("invalid input");
                        }
                    }
                    break;
                case 2:
                    if(drink_list.size()==0){
                        System.out.println("Empty");
                    }
                    else{
                        for(int i = 0;i<drink_list.size();i++){
                            System.out.printf("%s %d\n",drink_list.get(i),count_list.get(i));
                        }
                    }
                    break;
                case 3:
                    int total = 0;
                    for(int j = 0;j < drink_list.size();j++){
                        total = total + count_list.get(j)*price_list.get(j);
                    }
                    System.out.println("total pay: "+total);
                    System.out.println("Please pay:");
                    int pay = scanner.nextInt();
                    if(total>pay){
                        System.out.println("money not enough");
                        break;
                    }
                    else{
                        System.out.printf("money change: %s\nthank you",pay-total);
                        finish = false;
                        break;
                    }
                case 4:
                    System.out.println("exit");
                    finish = false;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}