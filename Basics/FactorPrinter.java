package Basics;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int number) {
        String num;
        if (number < 1)
            System.out.println("inavlid value");
        else {

            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }

        }
    }
}
