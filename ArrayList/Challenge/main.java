package ArrayList.Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            printAction();
            switch(Integer.parseInt(scanner.nextLine())){
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }
    private static void addItem(ArrayList<String> groceries)
    {
        System.out.println(("Add item(s) (separated by comma"));
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));

        for(String i : items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed)<0)
                groceries.add(trimmed);
        }

    }

    private static void removeItem(ArrayList<String> groceries)
    {
        System.out.println(("Remove item(s) (separated by comma"));
        String[] items = scanner.nextLine().split(",");
        for(String i : items){
            String trimmed = i.trim();
                groceries.remove(trimmed);
        }

    }

    private static void printAction(){
        String textBlock = """
                Available actions:
                
                0- to shutdown
                
                1- to add item(s) to list
                
                2 - to remove any items
                
                Enter a number for the required action:""";
        System.out.println(textBlock+" ");
    }

}
