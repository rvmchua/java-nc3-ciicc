import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers: ");

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = input.nextInt();
        }

        System.out.println("You entered:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
