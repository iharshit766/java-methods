import java.util.Scanner;

public class HandshakeCalculator {
    // this method calculates the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for number of students
        System.out.print("enter the number of students: ");
        int n = scanner.nextInt();

        // calculating the maximum number of handshakes
        int handshakes = calculateHandshakes(n);

        // printing the result
        System.out.println("the maximum number of handshakes is " + handshakes);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
