import java.util.Scanner;

public class SumOfNaturalNumbers {
    // this method calculates the sum of n natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for n
        System.out.print("enter a positive integer: ");
        int n = scanner.nextInt();

        // calculating the sum of n natural numbers
        int sum = findSum(n);

        // displaying the result
        System.out.println("the sum of " + n + " natural numbers is " + sum);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
