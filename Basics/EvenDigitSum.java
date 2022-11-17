package Basics;
public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {
        int sum;
        int evenDigit = 0;
        if (number < 0)
            return -1;
        else {
            int digit = 0;
            while (number > 0) {
                digit = number % 10;
                number = number / 10;
                if (digit % 2 == 0) {
                    evenDigit += digit;
                }
            }
            return evenDigit;
        }
    }
}
