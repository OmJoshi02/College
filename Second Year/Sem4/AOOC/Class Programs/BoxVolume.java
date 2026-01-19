import java.util.*;

public class BoxVolume {
    double width;
    double height;
    double length;

    double volume(){
        return width*height*length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BoxVolume v = new BoxVolume();
        v.length = scan.nextInt();
        v.width = scan.nextInt();
        v.height = scan.nextInt();

        System.out.println(v.volume());
    }
}
