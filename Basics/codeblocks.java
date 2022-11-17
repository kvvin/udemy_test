package Basics;
public class codeblocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("your score was less than 5000");
        } else if (score > 5000) {
            System.out.println("your score is greater than 5000");
        } else {
            System.out.println("your score is 5000");
        }

        if (gameOver) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("final score is:" + finalScore);

        } else
            System.out.println("game not over");

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("final score 2 is:" + finalScore);

        } else
            System.out.println("game not over");


    }
}
