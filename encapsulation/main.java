package encapsulation;

public class main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "kevin";
        player.health = 29;
        player.weapon = "gun";

        int damage =29;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Steve",50,"knife");
        System.out.println("Initial health = "+ player1.getHealth());

        Printer printer = new Printer(50,true);
        System.out.println("initial pg count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was: "+pagesPrinted + ", new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was: "+pagesPrinted + ", new total print count for printer = " + printer.getPagesPrinted());
    }

}
