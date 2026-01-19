import java.math.BigInteger;
import java.util.*;
import java.math.BigInteger;

public class squares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the number till square want to print : ");
            //Use to take 32bit value.
             //int n = scan.nextInt();
             //Use to take unlimited value.
            String input = scan.next();
            BigInteger limit = new BigInteger(input); //convert to BigInteger

            BigInteger i = BigInteger.ONE;

            while (i.compareTo(limit) <= 0){
                BigInteger square = i.multiply(i);
                System.out.println("Square of " + i + " is: " + square);
                i = i.add(BigInteger.ONE); //i++ in the form of BigInteger
            }
        }
        catch (Exception e){
            System.out.println("Invalid input please enter only integer.");
        }
    }
}
