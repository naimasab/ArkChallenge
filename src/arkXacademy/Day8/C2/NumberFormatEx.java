package arkXacademy.Day8.C2;

import java.util.Scanner;

public class NumberFormatEx {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number : ");
            String userInput = scanner.nextLine();
            try {

                int number = Integer.parseInt(userInput);
                System.out.println("number:"+ number);
            } catch (NumberFormatException e) {
                System.out.println("You entered: " + e.getMessage());
            }
        }
}
