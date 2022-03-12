/**
Practice 4
Student numnber : 108201017
Course : 2022-CE1004-B
 */
class Pet {
    void  speak(){System.out.println("I'm not a pet.");}
}

class Cat extends Pet {
    void  speak(){System.out.println("I'm a cat.");}
}

class Dog extends Pet {
    void  speak(){System.out.println("I'm a dog.");}
}

class  newborn_Cat extends Cat {
    void  speak(){System.out.println("I can't speak but I can meow.");}
}

class  newborn_Dog extends Dog {
    void  speak(){System.out.println("I can't speak but I can woof.");}
}
public class P4_108201017 {
    public static void main(String[] args) {
        Pet putin = new Pet();
		Cat neko  = new Cat();
		Dog inu   = new Dog();
		newborn_Cat meow = new newborn_Cat();
		newborn_Dog woof = new newborn_Dog();
		putin.speak();
		neko.speak();
		inu.speak();
		meow.speak();
		woof.speak();
    }
}