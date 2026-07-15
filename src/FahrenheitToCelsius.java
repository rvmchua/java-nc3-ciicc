import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        input.close();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.format("Temperature in Celsius: %.2f°C", celsius);
    }
}
