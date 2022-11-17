package Basics;
public class converter {
    public static void main(String[] args) {
        calcFeetandInchesToCentimeters(-5, 11);
        double cm = calcFeetandInchesToCentimeters(6, 0);
        calcFeetandInchesToCentimeters(100);

    }

    public static double calcFeetandInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid parameters");
            return -1;
        }
        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(feet + "feet, " + inches + " inches = " + cm + " cm");
        return cm;


    }

    public static double calcFeetandInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches =  " + feet + "feet and " + remainingInches + " inches");
        return calcFeetandInchesToCentimeters(feet, remainingInches);


    }

}
