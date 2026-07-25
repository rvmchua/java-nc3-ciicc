import java.util.Arrays;

public class DoubleTheElements {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3};
        int[] doubleTheElements = new int[arrayNumbers.length];

        for (int index = 0; index < arrayNumbers.length; index++) {
            doubleTheElements[index] = arrayNumbers[index] * 2;
        }

        System.out.println("Input Array: " + Arrays.toString(arrayNumbers));
        System.out.println("Double Array: " + Arrays.toString(doubleTheElements));
    }
}
