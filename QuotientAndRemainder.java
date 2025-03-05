import java.util.Scanner;

public class QuotientAndRemainder {
    // this method finds the quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for number and divisor
        System.out.print("enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("enter the divisor: ");
        int divisor = scanner.nextInt();

        // finding the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // displaying the result
        System.out.println("the quotient is " + result[0]);
        System.out.println("the remainder is " + result[1]);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
