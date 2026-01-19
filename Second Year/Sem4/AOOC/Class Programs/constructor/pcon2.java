import java.util.*;

class pcon2{

    String fname;
    String lname;
    int age;

    pcon2(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fname = scan.nextLine();
        String lname = scan.nextLine();
        int age = scan.nextInt();

        pcon2 ob = new pcon2(fname, lname, age);
        
        System.out.println(ob.fname);
        System.out.println(ob.lname);
        System.out.println(ob.age);
    }
}