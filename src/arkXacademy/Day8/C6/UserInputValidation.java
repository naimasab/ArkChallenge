package arkXacademy.Day8.C6;


    import java.util.InputMismatchException;
import java.util.Scanner;

    public class UserInputValidation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int userInput = 0;


            while (true) {
                try {
                    System.out.print("Enter a positive integer: ");
                    userInput = scanner.nextInt();


                    if (userInput > 0) {
                        break;
                    } else {
                        System.out.println("Please enter a positive integer.");
                    }
                } catch (InputMismatchException e) {

                    System.out.println("Invalid input. Please enter a valid positive integer.");
                    scanner.nextLine();
                }
            }


            scanner.close();


            System.out.println("You entered a valid positive integer: " + userInput);
        }
    }

