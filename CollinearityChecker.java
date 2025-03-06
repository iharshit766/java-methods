import java.util.Scanner;

public class CollinearityChecker {
    // Method to check collinearity (slope formula)
    public static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        return slopeAB == slopeBC; // Collinear if slopes are equal
    }

    // Method to check collinearity (area of the triangle)
    public static boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // Collinear if area is 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        System.out.print("Enter x3 and y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        
        // Checking collinearity using both methods
        boolean collinearSlope = isCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = isCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear using Slope method: " + collinearSlope);
        System.out.println("Collinear using Area method: " + collinearArea);
        
        scanner.close();
    }
}
