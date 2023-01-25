package Arrays;
import java.util.*;
class Recruitment {
    String name;
    String quali;
    String gender;
    int exp;

    public Recruitment(String name, String quali, String gender, int exp) {
        this.name = name;
        this.quali = quali;
        this.gender = gender;
        this.exp = exp;
    }

    public int getExperience() {
        return this.exp;
    }
}
class candidates{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name, quali, gender;
        int exp;
        ArrayList<Recruitment> employeeList = new ArrayList<>();
        for(int i =0; i<n; i++)
        {
            name = sc.nextLine();
            quali = sc.nextLine();
            gender = sc.nextLine();
            exp = sc.nextInt();
            employeeList.add(new Recruitment(name, quali,gender, exp));
        }

        employeeList.sort(Comparator.comparing(Recruitment::getExperience));
        for(Recruitment employee : employeeList){
            System.out.println(employee.name);
            System.out.println(employee.quali);
            System.out.println(employee.exp);
        }

    }
}