import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt(); // use double
        System.out.print("Enter the height: ");
        int height = input.nextInt(); // use double
        input.close();

        // can use double area = (base * height) / 1 if input was nextDouble()
        double area = ((double) base * (double) height) / 2;
        System.out.format("The area of the triangle is: %.1f", area);
    }
}
