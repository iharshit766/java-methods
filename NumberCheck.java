import java.util.Scanner;

public class NumberCheck {
    // this method checks if a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for the number
        System.out.print("enter a number: ");
        int number = scanner.nextInt();

        // checking the number and displaying the result
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println("the number is positive.");
        } else if (result == -1) {
            System.out.println("the number is negative.");
        } else {
            System.out.println("the number is zero.");
        }

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
