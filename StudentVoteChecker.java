import java.util.Scanner;

public class StudentVoteChecker {

    // method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // negative age is invalid
        }
        return age >= 18; // returns true if 18 or above, otherwise false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10]; // array to store ages of 10 students

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("Voting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
        }
        
        scanner.close();
    }
}
