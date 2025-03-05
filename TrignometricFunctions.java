import java.util.Scanner;

public class TrignometricFunctions {
    // this method calculates sine, cosine, and tangent values for a given angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for the angle in degrees
        System.out.print("enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // calculating trigonometric values
        double[] results = calculateTrigonometricFunctions(angle);

        // displaying the results
        System.out.printf("sine: %.4f%n", results[0]);
        System.out.printf("cosine: %.4f%n", results[1]);
        System.out.printf("tangent: %.4f%n", results[2]);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
