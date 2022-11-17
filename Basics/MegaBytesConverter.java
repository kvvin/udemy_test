package Basics;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mb;
        int remmb;
        if (kiloBytes < 0) {
            System.out.println("Invalid Input");
        } else {
            mb = kiloBytes / 1024;
            remmb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remmb + " KB");
        }

    }

}
