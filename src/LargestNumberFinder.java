import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();
        int largestNumber;

        if (first == second && second == third) {
            System.out.println("All numbers are equal.");
        } else {
            if (first >= second && first >= third) {
                largestNumber = first;
            } else if (second >= third) {
                largestNumber = second;
            } else {
                largestNumber = third;
            }
            System.out.println("Largest number: " + largestNumber);
        }
        input.close();
    }
}
