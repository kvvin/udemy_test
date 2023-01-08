package StringFormatting;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print A bullet list:\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Second Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bullet List:
                             \u2022 First Point
                                 \u2022 Second Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("%nAge = %d, Birth year = %.2f", age, (float)yearOfBirth);
    }

}
