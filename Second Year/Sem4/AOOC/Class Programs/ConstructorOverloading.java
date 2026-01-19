import java.util.*;

public class ConstructorOverloading {

    double rad;
    double base, height;

    ConstructorOverloading(double r){
        this.rad = r;
    }

    ConstructorOverloading(double base, double height){
        this.base = base;
        this.height = height;
    }

    double circleoutput(){
        return 3.14*rad*rad;
    }

    double triangleoutput(){
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double r = scan.nextDouble();

        ConstructorOverloading c1 = new ConstructorOverloading(r);
        System.out.println(c1.circleoutput());

        System.out.println("Enter the base and height : ");
        double base = scan.nextDouble();
        double height = scan.nextDouble();

        ConstructorOverloading c2 = new ConstructorOverloading(base, height);
        System.out.println(c2.triangleoutput());


    }
}
