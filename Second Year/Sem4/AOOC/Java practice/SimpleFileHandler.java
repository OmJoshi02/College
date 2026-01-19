import java.util.*;
import java.io.*;

public class SimpleFileHandler {

    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Provide file name as commandline argument");
            return;
        }

        String filename = args[0];
        File file = new File(filename);
        Scanner scan = new Scanner(System.in);

        try {
            if(file.exists()){
                System.out.println("File exits. Content of file : ");
                FileReader fr = new FileReader(file);
                int ch;
                while((ch = fr.read()) != -1){
                    System.out.print((char) ch);
                }
                fr.close();

                System.out.println("Do you want to add data in this file ? (y/n) : ");
                String answer = scan.next();
                if(answer.equalsIgnoreCase("y")){
                    writetoFile(file, true);
                }
                else{
                    System.out.println("No data added");
                }
            }
            else {
                System.out.println("File doesnot exist, Creating a new file ...");
                writetoFile(file, false);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writetoFile(File file, boolean append) throws IOException{
        FileWriter fw = new FileWriter(file, append);
        Scanner input = new Scanner(System.in);
        System.out.println("Type text to add . type 'exit' to stop");

        while (true) {
            String line = input.nextLine();
            if(line.equalsIgnoreCase("exit")){
                break;
            }
            fw.write(line+"\n");
        }

        fw.close();
        System.out.println("Data written to file successfully");
    }
}
