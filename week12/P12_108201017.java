package stu_108201017;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class P12_108201017  {

    public static void main(String[] args) throws IOException {
        File doc = new File("e2-2.txt");
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        String point = obj.readLine();
        String points[] = point.split("\\[\\[|,|\\],\\[|\\]\\]");
        ArrayList<Integer> point_x = new ArrayList();
        ArrayList<Integer> point_y = new ArrayList();
        for(int i=0;i<points.length;i++){
            if(i%2!=0 && points[i].matches("\\d")){
                point_x.add(Integer.parseInt(points[i]));
            }
            else if(i%2==0 && points[i].matches("\\d")){
                point_y.add(Integer.parseInt(points[i]));
            }
        }
        String circle = obj.readLine();
        String circles[] = circle.split("\\[\\[|,|\\],\\[|\\]\\]");
        ArrayList<Integer> circle_x = new ArrayList();
        ArrayList<Integer> circle_y = new ArrayList();
        ArrayList<Integer> circle_r = new ArrayList();
        for(int i=0;i<circles.length;i++){
            if(i%3==1 && circles[i].matches("\\d")){
                circle_x.add(Integer.parseInt(circles[i]));
            }
            else if(i%3==2 && circles[i].matches("\\d")){
                circle_y.add(Integer.parseInt(circles[i]));
            }
            else if(i%3==0 && circles[i].matches("\\d")){
                circle_r.add(Integer.parseInt(circles[i]));
            }
        }
        ArrayList<Integer> line = new ArrayList<>();
        String line1 = obj.readLine();
        String lines[] = line1.split("\\[\\[|,|\\],\\[|\\]\\]");
        for(int i=0;i<lines.length;i++) {
            if(lines[i].matches("\\d")){
                line.add(Integer.parseInt(lines[i]));
            }
        }
        int temp;
        for(int i=0;i<4;i++){
            temp = 0;
            for(int j=0;j<5;j++){
                if(Math.pow((point_x.get(j)-circle_x.get(i)),2)+Math.pow((point_y.get(j)-circle_y.get(i)),2) <= Math.pow(circle_r.get(i),2)){
                    temp = temp + 1;
                }
            }
            System.out.print(temp+" ");
        }
        for(int k=0;k<4;k++) {
            double check = Math.abs(line.get(0)*circle_x.get(k)+line.get(1)*circle_y.get(k)+line.get(2))/Math.sqrt(Math.pow(line.get(0),2)+Math.pow(line.get(1),2));
            if(check < circle_r.get(k)){
                System.out.print("intersect ");
            }
            else if(check == circle_r.get(k)){
                System.out.print("tangent ");
            }
            else{
                System.out.print("disjoint ");
            }
        }

        }
}
