
import java.util.*;

public class BoxVolParameters {
    double width;
    double height;
    double length;

    void setdim(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume(){
        return width*height*length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        double length = scan.nextDouble();

        BoxVolParameters p = new BoxVolParameters();
        p.setdim(width,height,length);

        double result = p.volume();
        System.out.println(result);
    }
}
