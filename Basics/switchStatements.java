package Basics;

public class switchStatements {
    public static void main(String[] args) {


       /* int switchVal = 5;
        switch(switchVal) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }*/

        char switchVar = 'D';

        switch (switchVar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Its " + switchVar);
                break;
            default:
                System.out.println("not found");
                break;
        }
        String B = "KevIn";

        switch (B.toLowerCase()) {
            case "kevin":
                System.out.println("Kevin");
                break;
            case "steve":
                System.out.println("Not kevin");
                break;
            default:
                System.out.println("blah");
                break;
        }

    }
}
