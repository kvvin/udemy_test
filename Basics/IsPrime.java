package Basics;

public class IsPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 10; j < 100; j++) {
            if (isPrime(j)) {
                count++;
                System.out.println(j + " is prime number");
                if (count == 100) {
                    System.out.println("exiting for loop");
                    break;
                }


            }

        }
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }
}
