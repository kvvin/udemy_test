package Basics;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 19));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {

            int lDigitA = a % 10;
            int lDigitB = b % 10;
            int lDigitC = c % 10;

            if (lDigitA == lDigitB || lDigitA == lDigitC || lDigitB == lDigitC)
                return true;
            else return false;
        } else return false;

    }

    public static boolean isValid(int num) {
        if ((num >= 10) && (num <= 1000))
            return true;
        else return false;
    }
}
