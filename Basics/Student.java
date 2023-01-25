package Basics;
import java.util.Scanner;

public class Student{
    int rollno, mark1,mark2,mark3;
    public Student(int rollno, int mark1, int mark2, int mark3)
    {
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}
class main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Student[] students = new Student[n];
    int highestM1 = 0, highestM2 = 0, highestM3 = 0;
    int rollNo1 = 0, rollNo2 = 0, rollNo3 = 0;
    for(
    int i = 0;
    i<n;i++)

    {
        int rollno = sc.nextInt();
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        students[i] = new Student(rollno, mark1, mark2, mark3);
        int totalMarks = mark1+mark2+mark3;
        System.out.println(totalMarks);

        if (mark1 > highestM1) {
            highestM1 = mark1;
            rollNo1 = rollno;
        }

        if (mark2 > highestM2) {
            highestM2 = mark2;
            rollNo2 = rollno;
        }
        if (mark3 > highestM3) {

            highestM3 = mark3;
            rollNo3 = rollno;
        }

    }

    System.out.println(rollNo1+" "+highestM1);
    System.out.println(rollNo2+" "+highestM2);
    System.out.println(rollNo3 +" "+highestM3);

    int highestTotal = 0;
    int rollNo = 0;
    for(int i = 0; i<n;i++) {

        int totalMarks = students[i].mark1 + students[i].mark2 + students[i].mark3;

        if (totalMarks > highestTotal) {
            highestTotal = totalMarks;
            rollNo = students[i].rollno;
        }
    }
    System.out.println(rollNo+highestTotal);
}}