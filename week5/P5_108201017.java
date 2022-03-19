/**
Practice 5
Student numnber : 108201017
Course : 2022-CE1004-B
 */
import java.util.Scanner;
class Role {
    String Name;
    int Hp;
    int Atk;
    Role(String name, int hp , int atk){
        this.Name = name;
        this.Hp = hp;
        this.Atk = atk;
    }
}
class Hero extends Role{
    String hero_weapon;
    int hero_weapon_atk;
    Hero(String name, int hp , int atk,String hero_weapon,int hero_weapon_atk){
        super(name, hp, atk);
        this.hero_weapon = hero_weapon;
        this.hero_weapon_atk = hero_weapon_atk;
    }
}
class Enemy extends Role{
    String drop;
    Enemy(String name, int hp ,int atk,String drop){
        super(name, hp, atk);
        this.drop = drop;
    }
}
public class P5_108201017 {
    public static void main(String[] args) {
        //第一階段
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero("",0,0,"",0);
        Enemy enemy = new Enemy("", 0, 0,"");
        boolean conti = true;
        boolean status = true;
        //創建角色
        create_hero(hero);
        create_enemy(enemy);
        System.out.println("============");
        //第二階段
        while(conti){
            System.out.println("A Wild "+enemy.Name+" appeared!");
            System.out.println("What will "+hero.Name+" do?");
            //戰鬥階段
            while(hero.Hp > 0 && enemy.Hp > 0){
                battle(hero, enemy);
            }
            //決定hero是否活著
            if(hero.Hp<=0){status = false;}//死亡
            else{status = true;}//活著
            //結束階段
            if(status == true){
                System.out.print(hero.Name+" win!");
                System.out.println(enemy.Name+" dropped item "+enemy.drop+" left on the ground.");
                System.out.println("Want another adventure?");
                System.out.println("1. Yes 2. No");
                int quit = scanner.nextInt();
                if(quit == 1){
                    //重新創造敵人
                    create_enemy(enemy);
                }
                else{
                    //戰勝結束
                    System.out.println("Game Over");
                    conti = false ;
                }
            }
            else{
                //戰敗退出
                System.out.print(enemy.Name+" win!");
                System.out.println(hero.Name+" dropped item "+hero.hero_weapon+" left on the ground.");
                System.out.println("Game Over");
                conti = false;
            }
        }
        scanner.close();
    }
    
    private static void create_hero(Hero hero) {
        System.out.println("Please Create a hero: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String HERO_NAME = scanner.next();
        System.out.print("Hp: ");
        int HERO_HP = scanner.nextInt();
        System.out.print("Atk: ");
        int HERO_ATK = scanner.nextInt();
        System.out.print(HERO_NAME+"'s Weapon: ");
        String HERO_WEAPON = scanner.next();
        System.out.print(HERO_NAME+"'s Weapon Atk: ");  
        int HERO_WEAPON_ATK = scanner.nextInt();
        hero.Name = HERO_NAME;
        hero.Hp = HERO_HP;
        hero.Atk = HERO_ATK;
        hero.hero_weapon = HERO_WEAPON;
        hero.hero_weapon_atk = HERO_WEAPON_ATK;
        System.out.println();
    }
    private static void create_enemy(Enemy enemy) {
        System.out.println("Please Create an enemy: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String ENEMY_NAME = scanner.next();
        System.out.print("HP: ");
        int ENEMY_HP = scanner.nextInt();
        System.out.print("Atk: ");
        int ENEMY_ATK = scanner.nextInt();
        System.out.print("DropItem: ");
        String DROPITEM = scanner.next();
        enemy.Name = ENEMY_NAME;
        enemy.Hp = ENEMY_HP;
        enemy.Atk = ENEMY_ATK;
        enemy.drop = DROPITEM;
    }
    private static void battle(Hero hero,Enemy enemy) {
        System.out.println(hero.Name+"'s Hp: "+hero.Hp);
        System.out.println(enemy.Name+"'s Hp: "+enemy.Hp);
        System.out.println("1.Attack 2.Do nothing");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        if(choose == 1){
            int hurt_point = hero.Atk+hero.hero_weapon_atk;
            hero.Hp = hero.Hp - enemy.Atk;
            enemy.Hp = enemy.Hp - hurt_point;
            System.out.println(hero.Name+" use "+hero.hero_weapon+" and hurt "+enemy.Name+" "+hurt_point+" points.");
        }
        else{
            System.out.println(hero.Name+" is doing nothing.");
        }
    }
}