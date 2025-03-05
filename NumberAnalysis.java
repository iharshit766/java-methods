import java.util.Scanner;

public class NumberAnalysis {
    
    // method to check if a number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // method to check if a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                System.out.println(isEven(num) ? "even." : "odd.");
            } else {
                System.out.println(num + " is negative.");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
        
        scanner.close();
    }
}
