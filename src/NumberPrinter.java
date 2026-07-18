import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter min number: ");
        int minNumber = input.nextInt();
        System.out.print("Enter max number: ");
        int maxNumber = input.nextInt();

        if(minNumber < 0 || maxNumber < 0){
            System.out.println("Numbers must be positive integers");
        } else {
            for (int displayNumber = minNumber; displayNumber <= maxNumber; displayNumber++) {
                System.out.println(displayNumber);
            }
        }
    }
}
