package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("enter elements");
        for(int i = 0; i<n;i++)
        {
            a[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(a));


    }
}
