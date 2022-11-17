package Basics;

public class operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("result 1 = " + result);
        int prevResult = result;
        System.out.println("previous result = " + prevResult);
        result = result - 1;
        System.out.println("New result = " + result);


        result = result * 10;
        System.out.println("2*10 =" + result);

        result = result / 10;
        System.out.println("result/10 = " + result);

        boolean isDumb = false;
        if (isDumb == false) {
            System.out.println("Is not dumb");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("HIgh score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println(("not a car"));
        }

        isCar = true;
        boolean wasCar = isCar ? true : false; //here we check whether isCar is true or false. if its true we set was car to true and vice versa
        if (wasCar) {
            System.out.println("was car is true");
        }


    }
}
