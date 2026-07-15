import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        input.nextLine();
        input.close();

        double sum = firstNumber + secondNumber;
        double difference =  firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / (double) secondNumber;
        double remainder = firstNumber % secondNumber;

        System.out.println("Results:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
