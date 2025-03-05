import java.util.Scanner;

public class WindChillCalculator {
    // this method calculates the wind chill temperature using the given formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for temperature and wind speed
        System.out.print("enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        // calculating wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // displaying the result
        System.out.printf("the wind chill temperature is %.2f degrees Fahrenheit.%n", windChill);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
