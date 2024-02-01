package arkXacademy.Day8.C1;


public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        try {
            arr[8]=7;

            System.out.println("This line won't be executed");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        }
    }
}
