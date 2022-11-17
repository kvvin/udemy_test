package Basics;

public class primitivetype {
    public static void main(String[] args) {
        byte t1 = 5;
        short t2 = 89;
        int t3 = 999;
        long t4 = (50000L + 10L * (t1 + t2 + t3));
        System.out.println(t4);

        short t5 = (short) (500 + 10 * (t1 + t2 + t3));
        System.out.println(t5);

    }
}
