import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to print prime numbers from 1 to n: ");
        int n = scan.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) { 
                if (i % j == 0) { 
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.print(i + " "); 
            }
        }
    }
}

