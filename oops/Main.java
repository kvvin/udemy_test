package oops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //car class
        //creating object
        /*Car porsche = new Car(); //created a new obj called porsche with template of car
        Car merc = new Car();
        porsche.setModel("E class");
        System.out.println("Model is: "+porsche.getModel());*/

        //calc class
        /*SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());*/

        //person class
        /*Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/

        //Bank account
        BankAccount kevsAccount = new BankAccount();/*("1234",1000,"Kevin Thomas","@blah",99950005);
        System.out.println("Customer Details:");*/
        System.out.println(kevsAccount.getCustomerName()+"\n"+kevsAccount.getAcNumber()+"\n"+kevsAccount.getEmail()+"\n"+kevsAccount.getCustomerPhoneNo()+"\n"+kevsAccount.getAcBalance());
        kevsAccount.deposit(2000);
        kevsAccount.withdrawl(13000);
        kevsAccount.deposit(1300000);
        kevsAccount.withdrawl(13100);

        BankAccount stevesac = new BankAccount("steve","stej@mem",999300);
        System.out.println(stevesac.getAcNumber()+ " name "+ stevesac.getCustomerName());

    }
}
