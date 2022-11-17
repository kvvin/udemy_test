package Basics;

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min =0;
        int max=0;
        boolean first = true;

        while(true)
        {
            System.out.println("enter number");
            boolean isAntInt = sc.hasNextInt();

            if(isAntInt){
                int num = sc.nextInt();
                if(first){
                    first=false;
                    min=num;
                    max=num;
                }
                if(num>max)
                {
                    max = num;
                }
                else if(num<min) {
                    min = num;
                }

            }
            else{
                break;
            }

            sc.nextLine(); //handles input
        }

        System.out.println("min = "+min +", "+"max = "+max);
        sc.close();

    }
}
