import java.util.Arrays;
import java.util.Scanner;

public class NumberCheck {
    // Counting the digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Storing digits of a number in an array
    public static int[] storeDigits(int num) {
        int length = countDigits(num);
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to check if a number is a Duck Number (contains a zero but not at the start)
    public static boolean isDuckNumber(int num) {
        String strNum = String.valueOf(num);
        return strNum.contains("0") && strNum.charAt(0) != '0';
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = storeDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Digits count: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(storeDigits(num)));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));

        
        scanner.close();
    }
}
