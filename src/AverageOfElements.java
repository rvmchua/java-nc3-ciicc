import java.util.Arrays;

public class AverageOfElements {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30};
        int sum = 0;
        int average = 0;

        for (int number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;

        System.out.println("Test Data");
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Average: " + average);

    }
}
