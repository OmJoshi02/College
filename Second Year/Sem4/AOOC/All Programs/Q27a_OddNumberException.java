class OddNumberException extends Exception {
    public OddNumberException(String msg) {
        super(msg);
    }
}

public class Q27a_OddNumberException {
    static void checkEven(int n) throws OddNumberException {
        if (n % 2 != 0)
            throw new OddNumberException("Odd number entered!");
        System.out.println("Even number accepted: " + n);
    }

    public static void main(String[] args) {
        try {
            checkEven(5);  // Try with even/odd
        } catch (OddNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
