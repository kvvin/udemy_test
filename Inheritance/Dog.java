package Inheritance;

import javax.swing.text.StringContent;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name); //calls contructor of the class that this is extended from(super class)
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;
        this.coat=coat;

    }
    private void chew(){
        System.out.println("Dog is chewing");
    }
    @Override
    public void eat() {
        System.out.println("dog is eating");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("DOg is walking");
        super.move(5); //use super when you are overriding another method with same name in the class

    }
    public void run(){
        System.out.println("dog is running");
        super.move(10);//use super when you are overriding another method with same name in the class

    }
    private void moveLegs(int speed){
        System.out.println("dog is moving legs");

    }
    @Override
    public void move(int speed){
        System.out.println("Dog is moving");
        moveLegs(speed);
        super.move(speed);
    }
}
