import java.io.*;

class FileAnalysis{
    public static void main(String[] args) {
        String filename = "sample1.txt";
        int wordCount = 0;
        int lineCount = 0;
        int vowelCount = 0;
        
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while((line = br.readLine()) != null){
                lineCount++;

                String[] words = line.trim().split("\\S+");
                wordCount += words.length;
                
                for(char ch : line.toLowerCase().toCharArray()){
                    if("aeiou".indexOf(ch) != -1){
                        vowelCount++;
                    }
                }
            }

            System.out.println("Total Lines : "+lineCount);
            System.out.println("Total words : "+wordCount);
            System.out.println("Total Vowels : "+vowelCount);
        } catch (IOException e) {
            System.out.println("Error reading file "+e.getMessage());
        }
    }
}