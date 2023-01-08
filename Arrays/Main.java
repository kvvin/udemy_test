package Arrays;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int [] myIntArray = new int[10];
        myIntArray[0]=450;
        myIntArray[1]=1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[3] = 3.5;
        System.out.println(myDoubleArray[3]);

        int[] myIntArray2 = new int[]{1,2,3,4,5}; //using array initializer
        int[] myIntArray3 = {1,2,3,4,5,6}; //using array initializer as anonymous array, it can only be used in declaration statement
        int arrayLength3 = myIntArray3.length;
        int arrayLength2 = myIntArray2.length;
        System.out.println("length of array 3 is: "+arrayLength3);
        System.out.println("last = "+ myIntArray3[arrayLength3-1]);

        int[] newArray;
        newArray = new int[]{5,4,3,2,1};
        for(int i =0; i< newArray.length;i++)
        {
            System.out.print((newArray[i]+" "));

        }
        System.out.println();

        int[] newArray2 = new int[10];
        for(int i = 0; i< newArray2.length;i++){
            newArray2[i] = newArray2.length - i;
        }
        for (int j : newArray2) {
            System.out.print((j + " "));
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray2));

        Object objVariable = newArray;
        if(objVariable instanceof int[]){
            System.out.println("objVAriable is an instance of int array");
        }

        Object[] objarray = new Object[3];
        objarray[0] = "hi";
        objarray[1] = new StringBuilder("World");
        objarray[2] = Arrays.toString(newArray2);
        System.out.println(Arrays.toString(objarray));


    }
}
