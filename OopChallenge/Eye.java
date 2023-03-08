package OopChallenge;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalConditon, String color, boolean isOpen) {
        super(name, medicalConditon);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void GetDetails() {
        super.GetDetails();
        System.out.println("Color: "+this.getColor());
    }

    public void open(){
        this.setOpen(true);
        System.out.println(this.getName()+" Opened");
    }
    public void close(){
        this.setOpen(false);
        System.out.println(this.getName()+" Closed");
    }
    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
