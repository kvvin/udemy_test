package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String [] ogArray = new String[] {"First","Second","Third"};
        var ogList = Arrays.asList(ogArray);

        ogList.set(0,"one");
        System.out.println("list: "+ogList);
        System.out.println("array: "+Arrays.toString(ogArray));

        ogList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(ogArray));

        //ogList.add("fourth");

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);



    }
}
