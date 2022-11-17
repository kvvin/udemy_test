package oops;

public class Car {
    private int doors;  //private dont allow the variables to be accessed outside the class
   // public int wheels;  (public allows it to be accessed outside the class,
   // but its the wrong way as it goes against
   // encapsulation hence u create a method as shown below)
    private int wheels;
    private String model;
    private String Engine;
    private String color;


    //setter
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("e class")) {
            this.model = model;
        }else{
            this.model= "unknown";
        }
    }
    //getter
    public String getModel()
    {
        return this.model;
    }



}
