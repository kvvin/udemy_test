package record;
public class main {
    public static void main(String[] args) {
            for(int i =1; i<=5;i++)
            {
                Student s = new Student("s930022"+ i,
                        switch(i){
                            case 1 -> "mary";
                            case 2 -> "Carol";
                            case 3 -> "kevin";
                            case 4 -> "steve";
                            case 5 -> "lisa";
                            default -> "anonymous";
                        }, "05/11/2002","java");
                System.out.println(s);
            }


        }
    }

