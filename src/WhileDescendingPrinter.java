import java.util.Scanner;

public class WhileDescendingPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println();

        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
