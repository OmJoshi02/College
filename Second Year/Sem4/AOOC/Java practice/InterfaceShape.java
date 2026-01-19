import java.util.*;

interface shape{
    double area();
}

class Rectangle implements shape{
    private double length, breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length * breadth;
    }
}

class Triangle implements shape{
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return 0.5*base*height;
    }
}

public class InterfaceShape {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter details for Rectangle : ");
        System.out.println("Enter length of rectangle : ");
        double l = scan.nextDouble();

        System.out.println("Enter breadth of rectangle : ");
        double b = scan.nextDouble();


        Rectangle rect = new Rectangle(l, b);
        System.out.println("Area of rectangle is : "+rect.area());

        System.out.println("Enter details for Triangle : ");
        System.out.println("Enter base of triangle : ");
        double base = scan.nextDouble();

        System.out.println("Enter height of triangle : ");
        double height = scan.nextDouble();

        Triangle tri = new Triangle(base, height);
        System.out.println("Area of triangle is : "+tri.area());
    }
}
