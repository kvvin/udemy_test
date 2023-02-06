package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Canberra");
        placesToVisit.add("Sydney");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
        //printItineray3(placesToVisit);
        testIterator(placesToVisit);
        testListIterator(placesToVisit);

    }
    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue method
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack method

        list.push("Alice Springs");
    }
    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println((s1+" was removed"));

        String s2 = list.removeFirst();
        System.out.println((s2+" was removed"));

        String s3 = list.removeLast();
        System.out.println((s3+" was removed"));

        //Queue methods
        String p1 = list.poll();
        System.out.println(p1+" was removed");

        String p2 = list.pollFirst();
        System.out.println(p2+" was removed");

        String p3 = list.pollLast();
        System.out.println(p3+" was removed");

        list.push("Sydney"); //last element in
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4+" was removed");

    }
    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = "+ list.get(4));
        System.out.println("First Element = "+list.getFirst());
        System.out.println("Last element = "+list.getLast());
        System.out.println("Darwin is at "+list.indexOf("Darwin"));
        System.out.println("Melbourne is at "+list.indexOf("Melbourne"));

        //Queue retrieval

        System.out.println("Element from element() = "+list.element());

        //stack retrieval
        System.out.println("Element from peek() = "+list.peek());
        System.out.println("Element from peekFirst() = "+list.peekFirst());
        System.out.println("Element from peekLast() = "+list.peekLast());
    }
public static void printItineray(LinkedList<String>list){
    System.out.println("Trip starts at " + list.getFirst());
    for(int i =1;i<list.size();i++){
        System.out.println("--> From: "+list.get(i-1)+ " to "+list.get(i));
    }
    System.out.println("Trip ends at "+ list.getLast());

}

    public static void printItineray2(LinkedList<String>list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town: list){
            System.out.println(("--> From "+previousTown+" to "+town));
            previousTown = town;
        }
        System.out.println("Trip ends at "+ list.getLast());

    }

    public static void printItineray3(LinkedList<String>list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println(("--> From "+previousTown+" to "+town));
            previousTown = town;
        }
        System.out.println("Trip ends at "+ list.getLast());

    }
    private static void testIterator(LinkedList<String> list){
        //normal iterator can only remove and move forward through the list
        var iterator = list.iterator();
        while(iterator.hasNext()){
           // System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane"))
                    iterator.remove();
        }
        System.out.println("Normal iterator: "+list);
    }
    private static void testListIterator(LinkedList<String> list){
        //List iterator u can remove and add elements and also move forwards and backwards as shown
        var listIterator = list.listIterator();
        while(listIterator.hasNext()){
            // System.out.println(iterator.next());
            if(listIterator.next().equals("Sydney"))
                listIterator.add("Lake Wivenhoe");
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("list iterator: "+list);
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }

}
