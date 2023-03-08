package AbstractClasses;

public abstract class animal {
    protected String type;
    private String size;
    private  double weight;

    public animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

}
