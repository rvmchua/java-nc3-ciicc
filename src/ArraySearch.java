import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {5, 12, 7, 9, 23, 18};
        System.out.print("Enter a number to search: ");
        int numberToSearch = input.nextInt();

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == numberToSearch) {
                System.out.println("Number " + numberToSearch + " found at index " + index);
                break;
            }

            if (index == numbers.length - 1) {
                System.out.println("Number " + numberToSearch + " not found in the array.");
                break;
            }
        }
        input.close();
    }
}
