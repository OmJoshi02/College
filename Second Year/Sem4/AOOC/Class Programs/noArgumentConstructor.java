import java.util.*;

public class noArgumentConstructor {

    String fname;
    String lname;
    int age;

    noArgumentConstructor(){
        fname = "Om";
        lname = "Joshi";
        age = 20;
    }

    public static void main(String[] args) {
        noArgumentConstructor n = new noArgumentConstructor();
        System.out.println(n.fname);
        System.out.println(n.lname);
        System.out.println(n.age);
    }
}
