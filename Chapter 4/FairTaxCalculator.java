import java.util.Scanner;

public class FairTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your expenses for the following categories:");

        System.out.print("Housing: $");
        double housing = scanner.nextDouble();

        System.out.print("Food: $");
        double food = scanner.nextDouble();

        System.out.print("Clothing: $");
        double clothing = scanner.nextDouble();

        System.out.print("Transportation: $");
        double transportation = scanner.nextDouble();

        System.out.print("Education: $");
        double education = scanner.nextDouble();

        System.out.print("Health Care: $");
        double healthCare = scanner.nextDouble();

        System.out.print("Vacations: $");
        double vacations = scanner.nextDouble();

        double totalExpenses = housing + food + clothing + transportation + education + healthCare + vacations;
        double fairTaxRate = 0.23; // Or 0.30 if you want to use that rate
        double estimatedFairTax = totalExpenses * fairTaxRate;

        System.out.printf("Estimated FairTax: $%.2f\n", estimatedFairTax);
    }
}