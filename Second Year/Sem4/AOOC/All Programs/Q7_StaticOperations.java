// Part A - Static Variable, Method, and Block
class StaticDemo {
    static int count;
    static {
        count = 0;
        System.out.println("Static block executed.");
    }

    static void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Q7_StaticOperations {
    public static void main(String[] args) {
        StaticDemo.increment();
        StaticDemo.increment();

        // Part B - Read file and count vowels, words, and 'a'
        try (java.util.Scanner sc = new java.util.Scanner(new java.io.File("sample.txt"))) {
            int vowelCount = 0, wordCount = 0, aCount = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                wordCount += line.split("\\s+").length;
                for (char c : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) vowelCount++;
                    if (c == 'a') aCount++;
                }
            }
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Words: " + wordCount);
            System.out.println("'a' occurred: " + aCount + " times");
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
}
