package Basics;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            for (int i = 0; i < getDigitCount(number); i++) {
                switch (reverseNumber % 10) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        break;
                }
                reverseNumber /= 10;

            }
        }
    }

    public static int reverse(int num) {
        int reverseNumber = 0;
        while (num != 0) {
            reverseNumber = (reverseNumber * 10) + (num % 10);
            num /= 10;

        }
        return reverseNumber;
    }

    public static int getDigitCount(int num) {
        if (num < 0)
            return -1;
        else {
            int count = 1;
            while (num > 9) {
                num = num / 10;
                count++;

            }
            return count;

        }
    }
}
