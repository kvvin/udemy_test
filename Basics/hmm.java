import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class hmm{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9#-]{1,})$");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find())
            System.out.println(str+":"+matcher.group());
        else
            System.out.println(str+":Invalid Identifier");
    }
}