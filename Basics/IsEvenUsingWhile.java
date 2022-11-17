package Basics;

public class IsEvenUsingWhile {
    public static void main(String[] args) {
        int num = 4;
        int lastNum = 20;
        int count = 0;

        while (num <= lastNum) {
            num++;
            if (!isEvenNum(num)) {
                continue;
            } else {
                System.out.println("even num " + num);
                count++;
                if (count >= 5) {
                    System.out.println("No of even numbers: " + count);
                    break;
                }

            }

        }
    }

    public static boolean isEvenNum(int num) {
        if (num % 2 == 0)
            return true;
        else return false;
    }
}
