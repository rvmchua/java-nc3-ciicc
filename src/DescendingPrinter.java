import java.util.Scanner;

public class DescendingPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max number: ");
        int maxNumber = input.nextInt();
        System.out.print("Enter min number: ");
        int minNumber = input.nextInt();

        for (int numberToDisplay = maxNumber; numberToDisplay >= minNumber; numberToDisplay--) {
            System.out.println(numberToDisplay);
        }

        System.out.println("Loop complete!");
        input.close();
    }
}
