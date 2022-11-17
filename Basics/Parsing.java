package Basics;

//converting string value to another data type
public class Parsing {
    public static void main(String[] args) {
        String num = "2018";
        System.out.println("num as string " + num);
        int numInt = Integer.parseInt(num);
        System.out.println(numInt);

        num += 1;
        numInt += 1;

        System.out.println(num);
        System.out.println(numInt);

        String doubNum = "123.123";
        double doubNum2 = Double.parseDouble(doubNum);
        System.out.println(doubNum2 + 0.9867);


    }

}
