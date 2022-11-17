package Basics;

public class operatorchallenge {
    public static void main(String[] args) {
        double var = 20.00d;
        double var2 = 80.00d;
        double result = (var + var2) * 100.00d;
        double rem = result % 40.00d;
        boolean isVal = rem == 0 ? true : false;
        System.out.println("boolean val: " + isVal);
        if (!isVal) {
            System.out.println("got some remainder");
        }

    }
}
