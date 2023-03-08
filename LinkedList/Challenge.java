package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class Challenge {
    public static void main(String[] args) {
        LinkedList<Place> placesTovist = new LinkedList<>();
        Place adelaide = new Place("Adelaide",1374);
        addPlace(placesTovist,adelaide);
        addPlace(placesTovist, new Place("Adelaide",1374));
        addPlace(placesTovist, new Place("adelaide",1374));
        addPlace(placesTovist, new Place("Brisbane",917));
        addPlace(placesTovist, new Place("Perth",3923));
        addPlace(placesTovist, new Place("Alice Springs",2771));
        addPlace(placesTovist, new Place("Melbourne",817));

        placesTovist.addFirst(new Place("Sydney",0));
        System.out.println(placesTovist);

        var iterator = placesTovist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while(!quitLoop) {
            if(!iterator.hasPrevious()){
                System.out.println("Originating: "+iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final: "+iterator.next());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                case "L":
                    System.out.println(placesTovist);
                    break;
                default:
                        quitLoop = true;
                        break;

            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)){
            System.out.println("Found duplicates: "+ place);
            return;}
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace: list){
            if(place.distance()<listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);


    }
    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
