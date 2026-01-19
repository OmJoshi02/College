import java.util.*;

class EmployeeInfo{
    String fname;
    String lname;
    public double msalary;

    public EmployeeInfo(){
        fname = "";
        lname = "";
        msalary = 0.0;
    }

    public void setter(String fname, String lname, double msalary){
        this.fname = fname;
        this.lname = lname;
        this.msalary = msalary;
    }

    public void getter(){
        System.out.println("First name of employee : "+fname);
        System.out.println("Last name of employee : "+lname);
        if(msalary < 0){
            msalary = 0;
        }else{
            System.out.println("Salary is : "+msalary);
        }
    }


}

class EmployeeTest extends EmployeeInfo{

    void display(){
        double ysalary = msalary*12;
        double raise = ysalary * 0.10;
        System.out.println("Yearly salary is : "+ysalary);
        System.out.println("Raised salary is : "+(ysalary + raise));
    }
}
class Employee {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String fname = scan.next();

        System.out.println("Enter last name : ");
        String lname = scan.next();

        System.out.println("Enter salary : ");
        double msalary = scan.nextDouble();

        EmployeeTest e = new EmployeeTest();

        e.setter(fname, lname, msalary);
        e.getter();
        e.display();
    }

}