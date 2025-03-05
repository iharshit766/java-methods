public class UnitConverter2 {
    
    // method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // sample conversions
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("10 feet to yards: " + convertFeetToYards(10));
        System.out.println("10 meters to inches: " + convertMetersToInches(10));
        System.out.println("10 inches to meters: " + convertInchesToMeters(10));
        System.out.println("10 inches to cm: " + convertInchesToCm(10));
    }
}
