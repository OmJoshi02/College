import java.util.*;
import java.io.*;

public class FileCount {

    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Provide filename via command line");
            return;
        }

        String filename = args[0];
        int vowels = 0;
        int wordCount = 0;
        int aCount = 0;

        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null){

                line = line.trim();
                if(!line.isEmpty()){
                    String[] words = line.split("\\s+");
                    wordCount = words.length;
                }

                line = line.toLowerCase();
                for(int i = 0; i < line.length(); i++){
                    char ch = line.charAt(i);

                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                        vowels++;
                    }

                    if(ch == 'a'){
                        aCount++;
                    }
                }
            }
            br.close();

            System.out.println("Total vowels: " + vowels);
            System.out.println("Total words: " + wordCount);
            System.out.println("Total occurrences of 'a': " + aCount);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
