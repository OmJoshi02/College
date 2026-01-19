// Base class
class Box {
    private double width;
    private double height;
    private double depth;

    // Copy constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

// Subclass that includes weight
class BoxWeight extends Box {
    double weight;

    // Constructor with parameters
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call parent constructor
        weight = m;
    }

    // Copy constructor
    BoxWeight(BoxWeight ob) {
        super(ob); // Call Box's copy constructor
        weight = ob.weight;
    }
}

// Main class
class SuperClass {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myclone = new BoxWeight(mybox1);

        double vol1 = mybox1.volume();
        System.out.println("Volume of mybox1 is: " + vol1);
        System.out.println("Weight of mybox1 is: " + mybox1.weight);

        double vol2 = myclone.volume();
        System.out.println("Volume of myclone is: " + vol2);
        System.out.println("Weight of myclone is: " + myclone.weight);
    }
}
