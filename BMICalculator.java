import java.util.Scanner;

public class BMICalculator {
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert cm to meters
        return weight / (heightM * heightM);
    }
    
    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] bmiData = new double[10][3]; // 2D array for weight, height, and BMI
        String[] bmiStatus = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            bmiData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            bmiData[i][1] = scanner.nextDouble();
            
            // Calculate BMI
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            bmiStatus[i] = getBMIStatus(bmiData[i][2]);
        }
        
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiStatus[i]);
        }
        
        scanner.close();
    }
}
