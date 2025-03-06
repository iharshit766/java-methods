import java.util.Scanner;

public class EuclideanLine {
    // Calculating Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Finding the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Slope
        double b = y1 - (m * x1); // y-intercept
        return new double[]{m, b}; // Returning an array [m, b]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        // Calculating Euclidean distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Finding line equation
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + equation[0] + "x + " + equation[1]);
        
        scanner.close();
    }
}
