import java.util.*;

public class matrix {

    // Matrix Addition
    public static void add(int[][] a, int[][] b, int[][] c, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    // Matrix Subtraction
    public static void subtract(int[][] a, int[][] b, int[][] c, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                c[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    // Matrix Multiplication
    public static void multi(int[][] a, int[][] b, int[][] c, int size){
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
        }
    }
    }

     public static void transpose(int[][] a, int[][] c, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                c[j][i] = a[i][j];
            }
        }
    }

    // Display Matrix
    public static void output(int[][] c, int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // Get Matrix Size
        System.out.print("Enter matrix size (e.g., 2 for 2x2): ");
        int size = scan.nextInt();

        int[][] a = new int[size][size];
        int[][] b = new int[size][size];
        int[][] c = new int[size][size];

        // Input Matrix A
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // Display Matrix A
        System.out.println("Matrix A:");
        output(a, size);

        // Input Matrix B
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        // Display Matrix B
        System.out.println("Matrix B:");
        output(b, size);

        // Choose operation
         System.out.println("Choose operation: \n1. Addition (+) \n2. Subtraction (-) \n3. Multiplication (*) \n4. Transpose (t)");
        char operation = scan.next().charAt(0);


        switch (operation) {
            case '+' -> {
                add(a, b, c, size);
                System.out.println("Result of Addition:");
                output(c, size);
            }
            
            case '-' -> {
                subtract(a, b, c, size);
                System.out.println("Result of Subtraction:");
                output(c, size);
            }
            
            case '*' -> {
                multi(a, b, c, size);
                System.out.println("Result of Multiplication:");
                output(c, size);
            }

             case 't' -> {
                transpose(a, c, size);
                System.out.println("Transpose of Matrix A:");
                output(c, size);
            }

            default -> System.out.println("Invalid operation! Please choose '+', '-', or '*'.");
        }
    }
}
