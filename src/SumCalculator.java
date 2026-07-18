import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int finalNumber = input.nextInt();
        int sum = 0;

        for(int counter = 0; counter <= finalNumber; counter++){
            sum += counter;
        }

        System.out.println("The sum from 1 to " + finalNumber + " is: " + sum);
    }
}
