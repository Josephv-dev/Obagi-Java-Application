// chapter 3.17-Exercise 2 (Gas Mileage)//

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;
        int tripNumber = 0;

        while (true) {
            System.out.print("Enter miles driven for trip (or -1 to end): ");
            int miles = scanner.nextInt();
            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used for trip: ");
            int gallons = scanner.nextInt();

            if (gallons == 0) {
                System.out.println("Gallons used cannot be zero.");
                continue; // Skip this iteration
            }

            double mpg = (double) miles / gallons; // Calculate MPG
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);

            totalMiles += miles;
            totalGallons += gallons;
            tripNumber++;

            if (totalGallons != 0) {
                double combinedMpg = (double) totalMiles / totalGallons; // Calculate combined MPG
                System.out.printf("Combined miles per gallon for all trips: %.2f\n", combinedMpg);
            } else {
                System.out.println("No gallons used yet.");
            }
        }

        if (tripNumber > 0) {
            System.out.println("Gas mileage calculation completed.");
        } else {
            System.out.println("No trips entered.");
        }
        scanner.close();
    }
}