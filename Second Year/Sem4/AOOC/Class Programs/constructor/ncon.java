
public class ncon{
    String fname;
    String lname;
    int age;

    ncon(){
        System.out.println("This is no argument constructor..");
        fname = "Om";
        lname = "Joshi";
        age = 20;
    }

    public static void main(String[] args) {
        ncon ob = new ncon();
        System.out.println(ob.fname);
        System.out.println(ob.lname);
        System.out.println(ob.age);
    }
}