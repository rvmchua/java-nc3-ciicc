import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        double area = Math.PI * radius * radius;

        System.out.format("The area of the circle is: %.2f", area);
    }
}
