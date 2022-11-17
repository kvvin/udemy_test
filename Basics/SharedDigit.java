package Basics;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));

    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99)
            return false;
        else {
            int lDigitx = x % 10;
            int fDigitx = x / 10;
            int lDigity = y % 10;
            int fDigity = y / 10;
            if (lDigitx == lDigity || lDigitx == fDigity || fDigitx == fDigity || fDigitx == lDigity)
                return true;
            else return false;


        }
    }
}
