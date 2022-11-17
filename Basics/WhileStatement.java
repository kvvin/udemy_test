package Basics;

public class WhileStatement {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.println("Count val is = " + count);
            count++;
        }
        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count val is = " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("count value was: " + count);
            count++;

            if (count > 100)
                break;

        } while (count != 6);

    }
}

