import java.awt.*;
import java.util.*;

interface Area{
    public static final double PI = 3.14;
    public double compute(double d1, double d2);
}

    class rect implements Area {
    public double compute(double d1, double d2) {
        return d1 * d2;
        }
    }

    class circle implements Area{
        public double compute(double radius, double ignored){
            return PI*radius*radius;
        }
    }

    class triangle implements Area{
        public double compute(double base, double height){
            return 0.5*base*height;
        }
    }
class areaDemo {
    public static void main(String[] args) {
        Area A;

        A = new rect();
        System.out.println("Rectangle area : "+A.compute(10,5));

        A = new circle();
        System.out.println("Circle area : "+A.compute(7,0));

        A = new triangle();
        System.out.println("Triangle area : "+A.compute(10,5));
    }
}
