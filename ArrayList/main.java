package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type,int count) {


    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
    public class main {
        public static void main(String[] args) {
            GroceryItem[] groceryArray = new GroceryItem[3];
            groceryArray[0] = new GroceryItem("milk");
            groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
            groceryArray[2] = new GroceryItem("Oranges","PRODUCE",5);
            System.out.println(Arrays.toString(groceryArray));

            ArrayList objectList = new ArrayList();
            objectList.add(new GroceryItem(("Butter")));
            objectList.add("Yogurt");

            ArrayList<GroceryItem> groceryList = new ArrayList<>();
            groceryList.add(new GroceryItem(("Butter")));
            groceryList.add(new GroceryItem("milk"));
            groceryList.add(new GroceryItem("oranges","PRODUCE",12));
            groceryList.set(0,new GroceryItem("apples","PRODUCE",7));
            groceryList.remove(2);
            System.out.println(groceryList);
        }
    }

