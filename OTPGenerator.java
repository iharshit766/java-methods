import java.util.Random;
import java.util.Scanner;

public class OTPGenerator {
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000); // Ensures a 6-digit number (100000 to 999999)
    }

    // Checking if OTP exists in the array
    public static boolean isDuplicate(int[] otps, int count, int newOtp) {
        for (int i = 0; i < count; i++) {
            if (otps[i] == newOtp) {
                return true; // Duplicate found
            }
        }
        return false; // Unique OTP
    }

    // Method to generate and validate 10 unique OTPs
    public static boolean generateAndValidateOTPs() {
        int[] otpArray = new int[10]; // Array to store 10 OTPs
        int count = 0;

        while (count < 10) {
            int otp = generateOTP();
            if (!isDuplicate(otpArray, count, otp)) {
                otpArray[count] = otp;
                System.out.println("Generated OTP: " + otp);
                count++;
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        boolean unique = generateAndValidateOTPs();
        System.out.println("Are all OTPs unique? " + unique);
    }
}
