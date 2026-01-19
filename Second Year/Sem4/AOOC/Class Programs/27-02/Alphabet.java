import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        // Input 10 names
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }

        // Sorting names alphabetically using Bubble Sort
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    // Swap names[i] and names[j]
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // Displaying sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
