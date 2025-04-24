//Using The Random Class Write A PROGRAM THAT Can Generate A 10 digit Account Number For A User\

import java.util.Random;

public class Generate10DigitAccountNumber {

    private final String DIGITS = "0123456789";

    public String generateAccountNumber(int length) {
        Random random = new Random();
        String accountNumber = "";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(DIGITS.length());
            char randomDigit = DIGITS.charAt(index); // Get the digit at the random index
            accountNumber = accountNumber + randomDigit; // Append the digit
        }
        return accountNumber;
    }

    public static void main(String[] args) {
        int length = 10;
        Generate10DigitAccountNumber generator = new Generate10DigitAccountNumber(); // Create an instance
        String accountNumber = generator.generateAccountNumber(length); // Call the generation method
        System.out.println("Account Number is: " + accountNumber);
    }
}

