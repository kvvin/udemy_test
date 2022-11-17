package constructors;

public class Main {
    public static void main(String[] args) {
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("bob",2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("tim","vlahav@mail.com",100.00);
        System.out.println(person3.getName());
    }

}
