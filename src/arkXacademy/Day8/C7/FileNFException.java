package arkXacademy.Day8.C7;
import java .io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNFException {
    public static void main(String[] args) {
        String filename = "data.txt";
        try ( BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) !=null) {
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("error :"+ e.getMessage());
        }

    }
}
