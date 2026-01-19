import java.util.*;

abstract class Shape{
    double dim1, dim2;
    abstract double area();
}

class Rectangle extends Shape{

    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return length * breadth;
    }
}

class Triangle extends Shape{
    double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        return 0.5*base*height;
    }
}

class AbstractArea{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter details of rectangle : ");
        System.out.println("Enter length : ");
        double length = scan.nextDouble();

        System.out.println("Enter breadth : ");
        double breadth = scan.nextDouble();

        System.out.println("Enter details of triangle : ");
        System.out.println("Enter base : ");
        double base = scan.nextDouble();

        System.out.println("Enter height : ");
        double height = scan.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        System.out.println(rect.area());

        Triangle tri = new Triangle(base, height);
        System.out.println(tri.area());
    }
}