/**
Practice 3
Student numnber : 108201017
Course : 2022-CE1004-B
 */
class Student {
    private String name;
    private Integer score;
    public Student (String NAME , int SCORE){
        this.name = NAME;
        this.score = SCORE;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public void changeScore (int new_score ){
        score = new_score;
    }
}
public class P3_108201017 {
    public static void main(String[] args) {
        // 以下不要改
        Student putin = new Student("Putin", 59);
        System.out.println(putin.getName() + " before: " + putin.getScore());
        putin.changeScore(40);
        System.out.println(putin.getName() + " after: " + putin.getScore());
        // putin.score = 100;
    }
}