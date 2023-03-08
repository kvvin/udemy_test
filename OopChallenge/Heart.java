package OopChallenge;

public class Heart extends Organ{
    private int rate;
    public Heart(String name, String medicalConditon, int rate) {
        super(name, medicalConditon);
        this.rate = rate;
    }

    @Override
    public void GetDetails() {
        super.GetDetails();

        System.out.println("Heart rate: "+this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


}
