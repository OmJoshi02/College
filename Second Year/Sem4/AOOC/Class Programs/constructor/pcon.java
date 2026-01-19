
class pcon{

    String fname;
    String lname;
    int age;

    pcon(String f, String l, int a){
        fname = f;
        lname = l;
        age = a;
    }

    public static void main(String[] args) {
        pcon ob = new pcon("Om", "Joshi", 20);
        System.out.println(ob.fname);
        System.out.println(ob.lname);
        System.out.println(ob.age);
        
    }
}