import java.util.Scanner;

public class FactorsCalculator {
    // method to find factors of a number and return as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // method to find the sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // getting user input
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        
        // finding factors
        int[] factors = findFactors(number);
        
        // displaying factors
        System.out.print("factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // calculating and displaying results
        System.out.println("sum of factors: " + sumOfFactors(factors));
        System.out.println("product of factors: " + productOfFactors(factors));
        System.out.println("sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        
        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
