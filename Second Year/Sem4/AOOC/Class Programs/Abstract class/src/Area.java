import java.awt.*;

abstract class Areatest {
    double dim1;
    double dim2;

    Areatest(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
class rectangle extends Areatest {

    rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area(){
        return dim1 * dim2;
    }
}
    class triangle extends Areatest{
        triangle(double a, double b){
            super(a,b);
    }

    @Override
    double area(){
            return 0.5*dim1*dim2;
    }
}

class Area{
    public static void main(String[] args) {
        Areatest rect = new rectangle(10,5);
        Areatest tri = new triangle(10,5);

        System.out.println("Area of triangle is : "+rect.area());
        System.out.println("Area of rectangle is : "+tri.area());
    }
}


