import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class squaresMultithread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int threads = Runtime.getRuntime().availableProcessors(); // 24 threads on your system
            System.out.println("Detected " + threads + " threads.");
            System.out.println("Enter the number till square want to print : ");
            String input = scan.next();
            BigInteger limit = new BigInteger(input);

            ExecutorService executor = Executors.newFixedThreadPool(threads);

            BigInteger total = limit;
            BigInteger perThread = total.divide(BigInteger.valueOf(threads));
            BigInteger start = BigInteger.ONE;

            for (int t = 0; t < threads; t++) {
                BigInteger end = (t == threads - 1) ? limit : start.add(perThread).subtract(BigInteger.ONE);

                BigInteger finalStart = start;
                BigInteger finalEnd = end;

                executor.execute(() -> {
                    BigInteger num = finalStart;
                    while (num.compareTo(finalEnd) <= 0) {
                        // Commented out to reduce I/O bottleneck
                        // System.out.println("Square of " + num + " is: " + num.multiply(num));
                        num = num.add(BigInteger.ONE);
                        num.multiply(num); // still calculate square to load CPU
                    }
                });

                start = end.add(BigInteger.ONE);
            }

            executor.shutdown();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter only integer.");
        }
    }
}
