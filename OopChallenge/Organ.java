package OopChallenge;

public class Organ {
    private String name;
    private String medicalConditon;

    public Organ(String name, String medicalConditon) {
        this.name = name;
        this.medicalConditon = medicalConditon;
    }

    public void GetDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition: "+this.getMedicalConditon());
    }


    public String getName() {
        return name;
    }

    public String getMedicalConditon() {
        return medicalConditon;
    }

    public void setName(String name) {
        this.name = name;
    }

}
