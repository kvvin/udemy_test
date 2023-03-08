package OopChallenge;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalConditon, boolean isEmpty) {
        super(name, medicalConditon);
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void GetDetails() {
        super.GetDetails();

        if(this.isEmpty())
            System.out.println("Stomach is empty, need to be fed");
        else
            System.out.println("Stomach is full");
    }
    public void digest(){
        System.out.println("Digesting begin");
    }

}
