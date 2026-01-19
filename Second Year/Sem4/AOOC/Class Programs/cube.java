import java.util.*;
import java.io.*;

public class cube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            for(int i = 1; i <=5; i++){
                System.out.println("Enter the number : ");
                int n = scan.nextInt();
                int cube = n*n*n;
                System.out.println("Cube of "+i+" is : "+cube);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Enterd element is not number...");
        }
        catch (Exception e){
            System.out.println("Unexpected error occurred" + e.getMessage());
        }
    }
}
