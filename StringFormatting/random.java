package StringFormatting;
import java.util.Random;
public class random {
        public static void main(String[] args)
        {
            String[] arr={"green", "orange", "yelow", "blue", "violet", "pink"};
            Random r=new Random();
            int randomNumber=r.nextInt(arr.length);
            System.out.println(arr[randomNumber]);
        }
    }

