// CarbonFootprintCalculator.java
import java.util.Scanner;

public class CarbonFootprintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter miles driven per year: ");
        double miles = input.nextDouble();
        
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double mpg = input.nextDouble();
        
        System.out.print("Enter electricity usage per month (kWh): ");
        double electricity = input.nextDouble();
        
        double co2FromGasoline = (miles / mpg) * 19.6;  // 19.6 lbs CO2 per gallon
        double co2FromElectricity = electricity * 12 * 0.92; // 0.92 lbs CO2 per kWh
        
        double totalFootprint = co2FromGasoline + co2FromElectricity;
        
        System.out.printf("Estimated Carbon Footprint: %.2f lbs CO2 per year%n", totalFootprint);
        
        input.close();
    }
}