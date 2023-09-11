package stu_108201017;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A12_2_108201017 {
    public static void main(String[] args) {
        try{
            ArrayList timeList = new ArrayList<>();
            ArrayList<DocumentElement> titleList = new ArrayList();
            Document document = Jsoup.connect("https://www.csie.ncu.edu.tw/").get();
            int length = document.select("div.item-title").size();
            for(int i=0; i<length;i++){
                titleList.add(new DocumentElement(document.select("div.item-time").get(i).text(),document.select("div.item-title").get(i).text()));
                timeList.add(document.select("div.item-time").get(i).text());
            }
            Collections.sort(timeList);
            Collections.sort(titleList,Comparator.comparing(item->timeList.indexOf(item.getTime())));
            for(int i=length-1; i>=0;i--){
                System.out.println(timeList.get(i)+"  "+titleList.get(i).getTitle());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
class DocumentElement{
    String time;
    String title;
    DocumentElement(String time,String title){
        this.time=time;
        this.title=title;
    }
    String getTime(){
        return time;
    }
    String getTitle(){
        return  title;
    }
}