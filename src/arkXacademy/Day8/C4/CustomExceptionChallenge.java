package arkXacademy.Day8.C4;


    public class CustomExceptionChallenge {
        public static void main(String[] args) {
            try {
                validateInput("Valid Input");
                validateInput("Invalid Input");
            } catch (CustomException e) {

                System.out.println("CustomException caught: " + e.getMessage());
            }
        }

        private static void validateInput(String input) throws CustomException {

            if (!input.equals("Valid Input")) {
                throw new CustomException("Invalid input: " + input);
            }
            System.out.println("Input is valid: " + input);
        }
    }
