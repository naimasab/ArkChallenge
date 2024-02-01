package arkXacademy.Day8.C3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReader {
    public static void main(String[] args) {

        String filePath = "file.txt";

       try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());
        }
    }
}

