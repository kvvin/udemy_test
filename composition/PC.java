package composition;

public class PC {
    private Case theCase; //case is a keyword in java (switch case) hence we used theCase
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        //fancy graphics
        monitor.drawPixelAt(1200,45,"red");
    }



}
