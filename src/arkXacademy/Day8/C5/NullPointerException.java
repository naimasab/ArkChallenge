package arkXacademy.Day8.C5;

public class NullPointerException {

        public static void main(String[] args) {

            String nullReference = null;

          try {

                int length = nullReference.length();
                System.out.println("Length of the string: " + length);
            } catch (java.lang.NullPointerException e) {
              System.out.println("NullPointerException : " + e.getMessage());

            }
        }
    }


