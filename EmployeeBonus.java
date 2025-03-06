import java.util.Random;

public class EmployeeBonus {
    // Generating random salary and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2]; // [salary, years of service]

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = random.nextInt(50000) + 50000; // Random salary between 50000 and 99999
            data[i][1] = random.nextInt(10) + 1; // Random years of service between 1 and 10
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] newData = new double[data.length][3]; // [new salary, bonus amount, new total salary]
        
        for (int i = 0; i < data.length; i++) {
            double bonusPercent = (data[i][1] > 5) ? 0.05 : 0.02; // 5% if > 5 years, else 2%
            double bonus = data[i][0] * bonusPercent;
            newData[i][0] = data[i][0] + bonus;
            newData[i][1] = bonus;
            newData[i][2] = newData[i][0];
        }
        return newData;
    }

    // Displaying data without using printf
    public static void displayData(int[][] oldData, double[][] newData) {
        System.out.println("Salary   Years   New Salary   Bonus   Total Salary");        
        for (int i = 0; i < oldData.length; i++) {
            System.out.println(oldData[i][0] + " " + oldData[i][1] + " " + newData[i][0] + " " + newData[i][1] + " " + newData[i][2]);
        }
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] newSalaryData = calculateBonus(employeeData);
        displayData(employeeData, newSalaryData);
    }
}
