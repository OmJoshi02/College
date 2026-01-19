import java.util.*;

public class PrivateMember {

    public int a = 5;
    private int b = 6;

    void show(){
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        PrivateMember ob = new PrivateMember();
        System.out.println(ob.a);
        ob.show();
    }
}
