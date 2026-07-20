import java.util.Scanner;

public class DescendingPrinterEasy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int totalNumber = input.nextInt();

        input.close();
        for (int numberToDisplay = totalNumber; numberToDisplay > 0; numberToDisplay--) {
            System.out.println(numberToDisplay);
        }

        System.out.println("Loop complete!");
    }
}
