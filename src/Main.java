import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your sentence (type 'exit' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the story.");
                break;
            }

            System.out.println("Enter your name: ");
            String author = scanner.nextLine();

            appendToStoryFile(author, input);
        }

        scanner.close();
    }

    private static void appendToStoryFile(String author, String sentence) {
        try (FileWriter writer = new FileWriter("storyprogress.txt", true)) {
            writer.write("Author: " + author + "\n");
            writer.write("Sentence: " + sentence + "\n\n");
            System.out.println("Story progress saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
