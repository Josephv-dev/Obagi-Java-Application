// 6.19 TotalSales

import java.util.Scanner;

public class TotalSales {

    public static void main(String[] args) {
        double[][] sales = new double[4][5]; // 4 salespeople, 5 products
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales information (salesperson number, product number, total dollar value):");
        System.out.println("Enter -1 to end input.");

        int salesperson;
        int product;
        double value;

        while (true) {
            salesperson = scanner.nextInt();
            if (salesperson == -1) {
                break;
            }
            product = scanner.nextInt();
            value = scanner.nextDouble();

            if (salesperson >= 1 && salesperson <= 4 && product >= 1 && product <= 5) {
                sales[salesperson - 1][product - 1] += value;
            } else {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("\nTotal Sales by Salesperson and Product:");
        System.out.printf("%10s", "Product");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%10s", "Salesperson " + i);
        }
        System.out.printf("%10s%n", "Total");

        double[] productTotals = new double[5];
        double[] salespersonTotals = new double[4];
        double grandTotal = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%10d", i + 1);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%10.2f", sales[i][j]);
                productTotals[j] += sales[i][j];
                salespersonTotals[i] += sales[i][j];
                grandTotal += sales[i][j];
            }
            System.out.printf("%10.2f%n", salespersonTotals[i]);
        }

        System.out.printf("%10s", "Total");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%10.2f", productTotals[i]);
        }
        System.out.printf("%10.2f%n", grandTotal);
    }
}