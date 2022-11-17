package Basics;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        double avg =0;
        int count = 0;
        boolean first = true;
        while(true)
        {
            System.out.println("enter number");
            boolean isAntInt = sc.hasNextInt();
            if(isAntInt){
                int num = sc.nextInt();
                sum += num;
                count++;
            }
            else{
                break;
            }
            avg = (double)sum/count;
            sc.nextLine();

        }
        System.out.printf("SUM = "+ sum +" AVG = "+Math.round(avg));
    }
}
