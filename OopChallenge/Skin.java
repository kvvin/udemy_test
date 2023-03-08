package OopChallenge;

public class Skin extends Organ{
    private String color;
    private int softness;

    public Skin(String name, String medicalConditon, String color, int softness) {
        super(name, medicalConditon);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void GetDetails() {
        super.GetDetails();

        System.out.println("Skin Color: "+ this.getColor());
    }

    public String getColor() {
        return color;
    }

}
