/**
Assignment 4
Student numnber : 108201017
Course : 2022-CE1002
 */
class Character{
    String name;
    int level;
    int health;
    Character(String name , int level , int health){
        this.name = name;
        this.level = level;
        this.health = health;
    }
    String getName(){
        return this.name;
    }
    int getLevel(){
        return this.level;
    }
    int getHealth(){
        return this.health;
    }
}
class Archer extends Character{
    Archer(String name , int level , int health){
        super(name, level, health);
    }
    void Attack(){
        System.out.println("弓箭手 : 發射弓箭");
    }
    void Reload(){
        System.out.println("弓箭手 : 填裝彈藥");
    }
}
class Medic extends Character{
    Medic (String name , int level , int health){
        super(name, level, health);
    }
    void Cure(){
        System.out.println("醫護兵 : 治癒中");
    }
}
public class A4_108201017 {
    static public void main(String args[]){
        Archer archer = new Archer("Alex",10,100);
        Medic medic = new Medic("Justin",5,100);
        System.out.printf("弓箭手：(%s, %d, %d)%n", archer.getName(),archer.getLevel(), archer.getHealth());
        System.out.printf("醫護兵：(%s, %d, %d)%n", medic.getName(),medic.getLevel(), medic.getHealth());
        archer.Reload();
        archer.Attack();
        medic.Cure();
    }
}