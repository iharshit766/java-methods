import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor (excluding the number itself)
    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2]; // Second last factor is the greatest proper divisor
    }

    // Method to find the sum of factors (excluding the number itself)
    public static int sumOfFactors(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            if (factor != num) sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int num) {
        long product = 1;
        for (int factor : findFactors(num)) {
            product *= factor;
        }
        return product;
    }

    // Method to check if a number is a Perfect number
    public static boolean isPerfect(int num) {
        return sumOfFactors(num) == num;
    }

    // Method to check if a number is Abundant (sum of divisors > number)
    public static boolean isAbundant(int num) {
        return sumOfFactors(num) > num;
    }

    // Method to check if a number is Deficient (sum of divisors < number)
    public static boolean isDeficient(int num) {
        return sumOfFactors(num) < num;
    }

    // Method to check if a number is Strong (sum of factorial of digits == number)
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    // Helper method to find factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Factors: " + java.util.Arrays.toString(findFactors(num)));
        System.out.println("Greatest Factor: " + greatestFactor(num));
        System.out.println("Sum of Factors: " + sumOfFactors(num));
        System.out.println("Product of Factors: " + productOfFactors(num));
        System.out.println("Is Perfect? " + isPerfect(num));
        System.out.println("Is Abundant? " + isAbundant(num));
        System.out.println("Is Deficient? " + isDeficient(num));
        System.out.println("Is Strong? " + isStrong(num));

        scanner.close();
    }
}
