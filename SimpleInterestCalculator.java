import java.util.Scanner;

public class SimpleInterestCalculator {
    // this method calculates simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for principal amount
        System.out.print("enter the principal amount: ");
        double principal = scanner.nextDouble();

        // getting user input for rate of interest
        System.out.print("enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // getting user input for time period in years
        System.out.print("enter the time period in years: ");
        double time = scanner.nextDouble();

        // calculating the simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // printing the result
        System.out.printf("the simple interest is %.2f for principal %.2f, rate of interest %.2f and time %.2f years.%n", 
                          simpleInterest, principal, rate, time);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}

