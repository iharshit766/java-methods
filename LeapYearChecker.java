import java.util.Scanner;

public class LeapYearChecker {
    // method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // getting user input
        System.out.print("enter a year: ");
        int year = scanner.nextInt();
        
        // checking and displaying result
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // closing the scanner
        scanner.close();
    }
}
