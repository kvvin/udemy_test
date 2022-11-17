package Basics;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(25.42);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round((kilometersPerHour / 1.609));
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);
        if (mph >= 0)
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        else
            System.out.println("Invalid Value");
    }

}
