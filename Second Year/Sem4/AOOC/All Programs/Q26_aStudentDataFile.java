import java.io.*;
import java.util.Scanner;

public class Q26_aStudentDataFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("student.dat"));

        System.out.print("Enter Name: ");
        dout.writeUTF(sc.nextLine());

        System.out.print("Enter Age: ");
        dout.writeInt(sc.nextInt());

        System.out.print("Enter Weight: ");
        dout.writeDouble(sc.nextDouble());

        System.out.print("Enter Height: ");
        dout.writeDouble(sc.nextDouble());

        sc.nextLine(); // flush newline
        System.out.print("Enter City: ");
        dout.writeUTF(sc.nextLine());

        System.out.print("Enter Phone: ");
        dout.writeLong(sc.nextLong());

        dout.close();

        // Reading
        DataInputStream din = new DataInputStream(new FileInputStream("student.dat"));
        System.out.println("\n--- Student Info ---");
        System.out.println("Name: " + din.readUTF());
        System.out.println("Age: " + din.readInt());
        System.out.println("Weight: " + din.readDouble());
        System.out.println("Height: " + din.readDouble());
        System.out.println("City: " + din.readUTF());
        System.out.println("Phone: " + din.readLong());

        din.close();
    }
}
