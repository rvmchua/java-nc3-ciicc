import java.util.Scanner;

public class ArrayElementByIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        boolean isValidIndex = false;

        do {
            System.out.print("Enter an index (0-4): ");
            int index = input.nextInt();
            if (index >= 0 && index < numbers.length) {
                System.out.println("The value at index " + index + " is " + numbers[index]);
                isValidIndex = true;
            } else System.out.println("Invalid index! Please enter a number between 0 and 4. \n");
        } while(!isValidIndex);

    }
}
