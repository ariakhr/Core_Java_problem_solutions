import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadLargeTextFile {

    public static void main(String args[]) throws FileNotFoundException{
        System.out.println("File processed : " + parseFileUsingScanner());
        listAllFilesInBaseFolder();
        System.out.println("File processed : " + parseFileUsingBufferedReader());

    }

    private static boolean parseFileUsingBufferedReader() {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = Files.newBufferedReader(Paths.get("src/resources/SampleText.txt"))) {
            System.out.println("=============== Start Scanning ==================");
            String line;
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(sb.toString());
            System.out.println("=============== End Scanning ==================");

        } catch(IOException ex) {
            System.out.println("Error while parsing file : "+ ex.getMessage());
            return false;
        }
        return true;
    }

    private static void listAllFilesInBaseFolder() {
        System.out.println("=============== Start Listing file names ==================");
        File file = new File(".");
        for(String fileNames : file.list()) System.out.println(fileNames);
    }

    private static boolean parseFileUsingScanner() {

        try{
            Scanner scanner = new Scanner(new File("src/resources/SampleText.txt"));
            System.out.println("=============== Start Scanning ==================");
            while(scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println("You can process the data : " + line);

            }
            System.out.println("=============== End Scanning ==================");
        } catch (FileNotFoundException ex) {
            System.out.println("Error while parsing file : "+ ex.getMessage());
            return false;
        }
        return true;
    }
}
