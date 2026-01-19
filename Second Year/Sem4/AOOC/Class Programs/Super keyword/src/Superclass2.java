import java.util.*;

class Superclass2 {

    int i = 5;
}

class B extends Superclass2{
    int i = 6;
    void show(){
        System.out.println("Super i : "+super.i);
        System.out.println("Sub i : "+i);

    }

    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
}
