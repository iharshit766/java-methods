import java.util.Scanner;

public class NumberCheckExtended {
    // finding the sum of digits in a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // finding the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 2);
            num /= 10;
        }
        return sum;
    }

    // Method to check if a number is a Harshad Number (divisible by sum of its digits)
    public static boolean isHarshadNumber(int num) {
        return num % sumOfDigits(num) == 0;
    }

    // Method to find digit frequency and store in 2D array
    public static int[][] digitFrequency(int num) {
        int[] freq = new int[10]; // Array to store frequency of each digit (0-9)
        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }

        // Creating 2D array to store digit and frequency
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;  // Digit
            result[i][1] = freq[i]; // Frequency
        }
        return result;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Sum of Digits: " + sumOfDigits(num));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(num));
        System.out.println("Is Harshad Number? " + isHarshadNumber(num));

        // Displaying digit frequency
        int[][] frequency = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int[] row : frequency) {
            if (row[1] > 0) { // Only printing non-zero frequencies
                System.out.println("Digit " + row[0] + " appears " + row[1] + " times.");
            }
        }

        
        scanner.close();
    }
}
