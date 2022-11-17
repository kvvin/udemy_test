package Basics;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int rev = 0;
        int num = number;
        while (num > 0) {
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;

        }
        if (number == rev)
            return true;
        return false;
    }

}
