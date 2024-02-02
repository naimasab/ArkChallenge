package arkXacademy.Day9.C1;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Elements in the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all element : " +sum);
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
            }
            if (numbers[i] <= min) {
                min = numbers[i];
            }

        }
        System.out.println("Maximum value : " +max);
        System.out.println("Minimum value : " +min);
    }
}
