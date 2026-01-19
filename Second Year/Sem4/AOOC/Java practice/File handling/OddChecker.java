
class OddNumberException extends Exception{
    public OddNumberException(String message){
        super(message);
    }
}

class OddChecker{
    public static void checkEven(int num) throws OddNumberException{
        if(num % 2 != 0){
            throw new OddNumberException("Number "+num+" is odd");
        }
        else{
            System.out.println("The number "+num+" is even");
        }
    }

    public static void main(String[] args) {
        int num = 7;
        try {
            checkEven(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
