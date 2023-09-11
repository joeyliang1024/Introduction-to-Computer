package stu_108201017;
import java.util.Scanner;
class calculate_BMI{
    private String name;
    private double weight;
    private  double height;
    public calculate_BMI(String name , double weight , double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public String get_Name (){
        return this.name;
    }
    public double get_weight(){
        return this.weight;
    }
    public double get_height(){
        return this.height;
    }
    public double get_BMI (){
        double BMI = weight/(height*height*0.0001);
        return Math.round(BMI*100)/100.0;
    }
}
public class BMI {
    public static void main(String[] args) {
        String s = "java is fun";
        s = "HTML";
        System.out.println(s.matches("[java.*]"));
        System.out.println("Please type your name, weight, and height : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String array[] = input.split(" ");
        calculate_BMI calculate_bmi = new calculate_BMI(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[2]));
        System.out.print(calculate_bmi.get_Name()+"'s height is ");
        System.out.print(calculate_bmi.get_height());
        System.out.print(" cm, weight is ");
        System.out.print(calculate_bmi.get_weight());
        System.out.print(" kg and BMI is ");
        System.out.print(calculate_bmi.get_BMI());

    }
}
