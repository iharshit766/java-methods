import java.util.Scanner;

public class SpringSeason {
    // this method checks if the given date falls in the spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user input for month and day
        System.out.print("enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("enter the day (1-31): ");
        int day = scanner.nextInt();

        // checking if it's spring season and displaying the result
        if (isSpringSeason(month, day)) {
            System.out.println("its a spring season");
        } else {
            System.out.println("not a spring season");
        }

        // closing the scanner to prevent resource leak
        scanner.close();
    }
}
