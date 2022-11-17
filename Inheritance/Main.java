package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,1,1,5,"lion");
        Dog dog =new Dog(8,10,"Yorkie",2,4,1,20,"silky");
        dog.eat();
        dog.walk();
    }
}
