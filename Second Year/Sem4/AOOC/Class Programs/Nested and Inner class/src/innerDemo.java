
class Outer{
    int out_x = 100;
    void test(){
        inner ob = new inner();
        ob.display();
    }

    class inner{
        void display(){
            System.out.println("X : "+out_x);
        }
    }
}
class innerDemo {
    public static void main(String[] args) {
        Outer ob = new Outer();

        ob.test();
    }
}
