package Basics;

public class methodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Kevin", 500);
        System.out.println("new score is " + newScore);
        calculateScore(40);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("null");
        return 0;

    }

}
