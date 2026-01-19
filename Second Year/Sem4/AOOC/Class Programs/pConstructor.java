import java.util.*;

public class pConstructor {


    String fname;
    String lname;
    int age;

    pConstructor(String fname, String lname, int age) {
        try {
            if(age < 0) throw new IllegalArgumentException("Age cannot be negative");

            this.fname = fname;
            this.lname = lname;
            this.age = age;
        }

        catch (IllegalArgumentException e){
            System.out.println("Error in constructor : "+e.getMessage());
        }
    }

    void display(){
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String fname = scan.next();
        String lname = scan.next();
        int age = scan.nextInt();
        pConstructor p = new pConstructor(fname, lname, age);

        p.display();
    }
}
