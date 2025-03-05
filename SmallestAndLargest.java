import java.util.Scanner;

public class SmallestAndLargest {
    // this method finds the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for three numbers
        System.out.print("enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("enter the third number: ");
        int number3 = scanner.nextInt();

        // finding the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // displaying the result
        System.out.println("the smallest number is " + result[0]);
        System.out.println("the largest number is " + result[1]);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
