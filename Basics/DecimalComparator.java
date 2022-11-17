package Basics;
public class DecimalComparator {
    public static void main(String[] args) {
        boolean p = areEqualByThreeDecimalPlaces(3.176, 3.175);
        System.out.println(p);

    }

    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
        int rvar1 = (int) (var1 * 1000);
        int rvar2 = (int) (var2 * 1000);
        if ((rvar1 - rvar2) == 0) {
            return true;
        }
        return false;
    }
}
