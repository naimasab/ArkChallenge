package arkXacademy.Day8.C8;
public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4] / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {

            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }
}


