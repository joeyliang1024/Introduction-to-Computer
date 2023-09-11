package stu_108201017;
import java.util.Scanner;

public class A10_108201017_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean conti = true;
        while(conti){
            try {
                System.out.println("請輸入整數");
                String a = s.next();
                String b = s.next();
                if(Integer.valueOf(b)==0){
                    System.out.println("分母不能為0");
                }
                else{
                System.out.println(Integer.valueOf(a) / Integer.valueOf(b));
                conti = false;
                }
                if(Integer.valueOf(a)<0 || Integer.valueOf(b)<0){
                    conti=true;
                    throw new Exception();
                }
            }
            catch (NumberFormatException e) {
                System.out.println("輸入為非整數");
            } catch (Exception e) {
                System.out.println("分子或分母為負數了！");
            }

        }
        s.close();
    }
}

