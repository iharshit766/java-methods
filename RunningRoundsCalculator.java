import java.util.Scanner;

public class RunningRoundsCalculator {
    // this method calculates the number of rounds needed to complete a 5 km run
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter); // rounding up to the nearest whole number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for the three sides of the triangular park
        System.out.print("enter the first side of the park in meters: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("enter the second side of the park in meters: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("enter the third side of the park in meters: ");
        double side3 = scanner.nextDouble();

        // calculating the number of rounds required
        int rounds = calculateRounds(side1, side2, side3);

        // displaying the result
        System.out.println("the athlete needs to complete " + rounds + " rounds to cover 5 km.");

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
