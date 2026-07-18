import java.util.Scanner;

public class SumCalculatorChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int finalNumber = input.nextInt();
        int sum = 0;
        int counter = 0;
        int[] expression = new int[finalNumber];


        while(counter <= finalNumber){
            sum += counter;
            counter++;
            int index = counter - 1;
            expression[index] = counter;
        }

        System.out.println("The sum from 1 to " + finalNumber + " is: " + sum);
    }
}
