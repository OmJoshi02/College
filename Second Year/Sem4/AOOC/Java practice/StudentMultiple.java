import java.util.*;

interface Student{
    int getRoll();
    void setRoll(int roll);
}

class Test implements Student{

    private int roll;
    protected int sub1;
    protected int sub2;

    public void setMarks(int sub1, int sub2){
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    @Override
    public void setRoll(int roll){
        this.roll = roll;
    }

    @Override
    public int getRoll(){
        return roll;
    }

}

class Result extends Test implements Student{
    public void display(){
        System.out.println("Student roll no : "+getRoll());
        System.out.println("Subject 1 marks : "+sub1);
        System.out.println("Subject 2 marks : "+sub2);
        int total = sub1 + sub2;
        System.out.println("Total : "+total);
    }
}

public class StudentMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Result r = new Result();

        System.out.println("Enter roll no : ");
        int roll = scan.nextInt();
        r.setRoll(roll);

        System.out.println("Enter marks for subject 1 : ");
        int sub1 = scan.nextInt();

        System.out.println("Enter marks for subject 2 : ");
        int sub2 = scan.nextInt();

        r.setMarks(sub1, sub2);

        r.display();
    }    
}
