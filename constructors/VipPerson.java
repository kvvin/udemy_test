package constructors;

public class VipPerson {
    private String name;
    private String emailAdd;
    private double credlim;

    public VipPerson(){
        this("Default name","default@mail.com",10000.00);
    }

    public VipPerson(String name, double credlim) {
        this(name,"unknown@mail.com",credlim);
    }

    public VipPerson(String name, String emailAdd, double credlim) {
        this.name = name;
        this.emailAdd = emailAdd;
        this.credlim = credlim;
    }
    public String getName(){
        return name;
    }
    public String getEmailAdd(){
        return emailAdd;
    }
    public double getCredlim(){
        return credlim;
    }






}
