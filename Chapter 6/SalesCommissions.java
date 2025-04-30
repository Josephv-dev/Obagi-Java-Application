/* 6.10 (Sales Commissions)
Calculate salespeople's earnings based on a weekly base salary of $200 plus a 9% commission on gross sales. 
Use an array to count how many salespeople fall into specific salary ranges, then display the results in a table
*/

public class SalesCommissions {

    public static void main(String[] args) {
        int[] salaryRanges = new int[9]; // Array to store counts for each salary range
        double[] grossSales = {5000, 3500, 6500, 8200, 10000, 2000, 4200, 6000, 12000, 7800}; // Sample gross sales for 10 salespeople

        // Calculate salaries and count occurrences in each range
        for (double sales : grossSales) {
            double salary = 200 + 0.09 * sales;
            int rangeIndex = (int) (salary / 100) - 2; // Determine the salary range index
            if (rangeIndex >= 0 && rangeIndex < salaryRanges.length - 1) {
                salaryRanges[rangeIndex]++;
            } else if (rangeIndex >= salaryRanges.length - 1) {
                salaryRanges[salaryRanges.length - 1]++; // $1000 and over
            }
        }

        // Display results in tabular format
        System.out.println("Salary Range\tNumber of Salespeople");
        System.out.println("------------------------------------");
        System.out.println("$200 - $299\t\t" + salaryRanges[0]);
        System.out.println("$300 - $399\t\t" + salaryRanges[1]);
        System.out.println("$400 - $499\t\t" + salaryRanges[2]);
        System.out.println("$500 - $599\t\t" + salaryRanges[3]);
        System.out.println("$600 - $699\t\t" + salaryRanges[4]);
        System.out.println("$700 - $799\t\t" + salaryRanges[5]);
        System.out.println("$800 - $899\t\t" + salaryRanges[6]);
        System.out.println("$900 - $999\t\t" + salaryRanges[7]);
        System.out.println("$1000 and over\t" + salaryRanges[8]);
    }
}