import java.util.Scanner;

public class NumberPrinterEasy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int totalNumber = input.nextInt();

        input.close();
        for (int numberToDisplay = 1; numberToDisplay <= totalNumber; numberToDisplay++) {
            System.out.println(numberToDisplay);
        }
    }
}
