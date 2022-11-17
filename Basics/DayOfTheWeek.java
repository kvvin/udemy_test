package Basics;
public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayofTheWeek(3);
        printDayofTheWeekUsingIf(5);
    }

    public static void printDayofTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayofTheWeekUsingIf(int day2) {
        if (day2 == 0)
            System.out.println("sunday");
        else if (day2 == 1)
            System.out.println("monday");
        else if (day2 == 2)
            System.out.println("tuesday");
        else if (day2 == 3)
            System.out.println("wednesday");
        else if (day2 == 4)
            System.out.println("thursday");
        else if (day2 == 5)
            System.out.println("friday");
        else if (day2 == 6)
            System.out.println("saturday");
        else
            System.out.println("invalid day");

    }
}
