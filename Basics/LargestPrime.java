package Basics;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;


        }
    }
}
