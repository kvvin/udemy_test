package Basics;

public class floatanddouble {
    public static void main(String[] args) {
        float f1 = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        System.out.println("f min " + f1);
        System.out.println(("f max " + f2));

        double d1 = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        System.out.println("f min " + d1);
        System.out.println(("f max " + d2));

        int i1 = 5 / 3;
        float f3 = 5f / 3f; //not recommended to use
        double d3 = 5d / 3d; //no need to type d but its a good habit
        System.out.println("int " + i1);
        System.out.println("float " + f3);
        System.out.println("double " + d3);


    }

}
