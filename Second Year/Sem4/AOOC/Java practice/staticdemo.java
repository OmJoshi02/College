import java.util.*;

public class staticdemo {

    static int count;

    static{
        count = 0;
        System.out.println("Static block executed");
    }

    static void increment(){
        count++;
        System.out.println("Count incremented : "+ count);
    }

    public static void main(String[] args){

        System.out.println("Main method started");
        staticdemo.increment();
        staticdemo.increment();
        System.out.println("Final count : "+staticdemo.count);
    }
}
