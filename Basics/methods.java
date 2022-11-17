package Basics;

//check codeblocks pgm to see expanded version of this code
public class methods {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 500, 5, 100); //executing/calling method
        System.out.println("final score is:" + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("final score is:" + highScore);

        int pos = calculateHighScorePos(1500);
        displayHighScorePosition("Kevin", pos);

        pos = calculateHighScorePos(900);
        displayHighScorePosition("Steve", pos);

        pos = calculateHighScorePos(400);
        displayHighScorePosition("Jack", pos);

        pos = calculateHighScorePos(50);
        displayHighScorePosition("Tom", pos);

        pos = calculateHighScorePos(500);
        displayHighScorePosition("James", pos);

    }

    //Creating a new method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (bonus * levelCompleted);
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String name, int pos) {
        System.out.println(name + " managed to get in " + pos);
    }

    public static int calculateHighScorePos(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
