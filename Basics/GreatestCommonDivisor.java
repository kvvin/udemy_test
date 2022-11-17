package Basics;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;
        else {
            while (first != second) {
                if (first > second) {
                    first = first - second;
                } else {
                    second = second - first;
                }

            }
            return first;

        }
    }
}
