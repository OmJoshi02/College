import java.io.*;

public class ReadData {
    public static void main(String[] args) {
        String filename = "sample1.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filename));){
            String line = br.readLine();

            do{
                System.out.println(line);

            }while((line = br.readLine()) != null);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
