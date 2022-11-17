package Basics;

import java.util.Scanner;
import java.util.Calendar;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNexInt = scanner.hasNextInt();
        if (hasNexInt) {
            int yob = scanner.nextInt();
            scanner.nextLine();
            if (yob < 0) {
                System.out.println("error");
            } else {

                System.out.println("Enter your name: ");
                String name = scanner.nextLine();

                Calendar cal = Calendar.getInstance();
                int age = cal.get(Calendar.YEAR) - yob;
                System.out.println("Your name is: " + name + " and you are " + age + " years old");

            }

        } else System.out.println("error");
        scanner.close();
    }
}
