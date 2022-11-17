package Basics;

public class byteshortintlong {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("myMinIntValue: " + myMinIntValue);
        System.out.println("myMaxIntValue: " + myMaxIntValue);

        byte minbyte = Byte.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        System.out.println(minbyte);
        System.out.println(maxbyte);

        short minshort = Short.MIN_VALUE;
        short maxshort = Short.MAX_VALUE;
        System.out.println(minshort);
        System.out.println(maxshort);

        long myLongval = 100L;

        long minlong = Long.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        System.out.println(minlong);
        System.out.println(maxlong);

        int myTotal = (myMinIntValue / 2);
        byte myByteTotal = (byte) (minbyte / 2); //casting
        short myNewShortVal = (short) (minshort / 2);


    }
}
