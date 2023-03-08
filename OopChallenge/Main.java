package OopChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Brad",28,
                new Eye("Left eye","Short Sighted","Blue",true),
                new Eye("Right Eye", "normal","Blue",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin","Burnt","White",40));
        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());

        Scanner sc = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Choose an Organ: "+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().GetDetails();
                    if(patient.getLeftEye().isOpen()){
                        System.out.println("\t\t1. Close the eye");
                        if(sc.nextInt() == 1)
                            patient.getLeftEye().close();
                        else
                            continue;
                    }else{
                        System.out.println("\t\t1. Open the eye");
                        if(sc.nextInt()==1)
                            patient.getLeftEye().open();
                        else
                            continue;
                    }
                    break;
                case 2:
                    patient.getRightEye().GetDetails();
                    if(patient.getRightEye().isOpen()){
                        System.out.println("\t\t1. Close the eye");
                        if(sc.nextInt() == 1)
                            patient.getRightEye().close();
                        else
                            continue;
                    }else{
                        System.out.println("\t\t1. Open the eye");
                        if(sc.nextInt()==1)
                            patient.getRightEye().open();
                        else
                            continue;
                    }
                    break;
                case 3:
                    patient.getHeart().GetDetails();
                    System.out.println("\t\t1. Change Heart rate");
                    if(sc.nextInt()==1){
                        System.out.println("Enter Heart Rate");
                        int newHeartRate = sc.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: "+patient.getHeart().getRate());
                    }
                    else continue;
                    break;
                case 4:
                    patient.getStomach().GetDetails();
                    System.out.println("\t\t1. Digest");
                    if(sc.nextInt()==1)
                        patient.getStomach().digest();
                    else continue;
                    break;
                case 5:
                    patient.getSkin().GetDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;

            }

        }

    }
}
