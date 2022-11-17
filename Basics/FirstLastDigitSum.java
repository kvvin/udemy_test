package Basics;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        else {
            int lastDigit = number % 10;
            while (number >= 10) {
                number = number / 10;
            }
            int firstDigit = number;
            int sum = firstDigit + lastDigit;
            return sum;


        }
    }
}
