package composition;

public class Main {
    public static void main(String[] args) {

        /*Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "DEll", "240", dimensions);
        Monitor theMonitor = new Monitor("42inch 4k", "Acer", 42, new Resolution(2160, 3840));
        Motherboard theMotherboard = new Motherboard("GG-420", "HP", 5, 6, "3.55");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();*/

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("queen", 3, 6,2,2);
        Lamp lamp = new Lamp("Antique",false,10);

        Bedroom bedroom = new Bedroom("kevins", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();




    }
}
