package Basics;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int i) {
        if (i > 0) {
            return i % 2 != 0;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int j;
        int sum = 0;
        if (end >= start && start > 0) {
            for (j = start; j <= end; j++) {
                if (isOdd(j)) {
                    sum += j;
                }
            }
            return sum;

        } else return -1;
    }

}
