package Basics;

import java.math.*;

import java.math.*;

public class TileGame {
    public static void main(String[] args) {
        int side = 4;  // side of a square tile (in cms)
        int n = 10;    // number of square tiles available
        int area = (int)Math.pow(side, 2);  // area of a single tile
        int max_area = 0;
        if(Math.sqrt(n) % 1 == 0) {
            max_area = area * (int)Math.sqrt(n);
        }else {
            int nearestPerfectSquare = (int)(Math.sqrt(n))^2;
            max_area = area* (int) Math.sqrt(nearestPerfectSquare);
        }
        System.out.println("The side of a square tile is " + side + " cms");
        System.out.println("The number of square tiles available is " + n);
        System.out.println("The area of the largest possible square is " + max_area + " square cms");
    }
}
