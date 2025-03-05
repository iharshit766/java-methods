import java.util.Scanner;

public class HandshakeCalculator2 {
    // this method calculates the maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for number of students
        System.out.print("enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // calculating the maximum number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // displaying the number of possible handshakes
        System.out.println("the maximum number of possible handshakes is " + handshakes);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
