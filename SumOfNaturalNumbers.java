import java.util.Scanner;

public class SumOfNaturalNumbers {
    // method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // method to find the sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // getting user input
        System.out.print("enter a natural number: ");
        int number = scanner.nextInt();
        
        // checking if input is a natural number
        if (number <= 0) {
            System.out.println("please enter a valid natural number.");
            scanner.close();
            return;
        }
        
        // calculating sum using recursion and formula
        int sumRecursive = sumUsingRecursion(number);
        int sumFormula = sumUsingFormula(number);
        
        // displaying results
        System.out.println("sum using recursion: " + sumRecursive);
        System.out.println("sum using formula: " + sumFormula);
        
        // verifying both methods give the same result
        if (sumRecursive == sumFormula) {
            System.out.println("both computations match. the result is correct.");
        } else {
            System.out.println("there is a mismatch in the results.");
        }
        
        // closing the scanner
        scanner.close();
    }
}
