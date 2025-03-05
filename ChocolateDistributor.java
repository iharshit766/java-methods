import java.util.Scanner;

public class ChocolateDistributor {
    // this method finds the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for number of chocolates and number of children
        System.out.print("enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // finding the chocolates each child gets and the remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // displaying the result
        System.out.println("each child gets " + result[0] + " chocolates");
        System.out.println("remaining chocolates: " + result[1]);

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
