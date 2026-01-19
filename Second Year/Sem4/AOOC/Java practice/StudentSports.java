import java.util.*;

class Student{
    private int roll;

    void setRoll(int roll){
        this.roll = roll;
    }
    void getRoll(){
        System.out.println("Roll no. of student : "+ roll);
    }
}

class Test extends Student{
    public String sub1, sub2;
    public int marks1, marks2;

    void setMarks(int marks1, int marks2){
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void setSubject(String sub1, String sub2){
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void getSubjects(){
        System.out.println("Name of subject 1 : "+sub1);
        System.out.println("Name of subject 2 : "+sub2);
    }
    void getMarks(){
        int total = marks1 + marks2;
        System.out.println("Marks for subject 1 : "+ sub1+" is : "+marks1);
        System.out.println("Marks for subject 2 : "+ sub2+" is : "+marks2);
        System.out.println("Total marks : "+total);
    }

    int totalMarks(){
        return marks1 + marks2;
    }
}

interface Sports{
    static int smarks = 10;
    void set();
}

class Result extends Test implements Sports{

    public void set(){
        int total = totalMarks();
        System.out.println("Sports marks are : "+ smarks);
        System.out.println("Total marks with sports are : "+(smarks + total));

    }
}

public class StudentSports {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter roll no. : ");
        int roll = scan.nextInt();

        System.out.println("Enter name of subject 1 : ");
        String sub1 = scan.next();

        System.out.println("Enter name of subject 2 : ");
        String sub2 = scan.next();

        System.out.println("Enter marks for subject  1 : ");
        int marks1 = scan.nextInt();

        System.out.println("Enter marks for subject 2 : ");
        int marks2 = scan.nextInt();

        Result r = new Result();
        r.setRoll(roll);
        r.setSubject(sub1, sub2);
        r.setMarks(marks1, marks2);

        r.getRoll();
        r.getSubjects();
        r.getMarks();
        r.set();

    }
}
