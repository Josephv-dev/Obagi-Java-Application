/* Making a Difference

3.39 (World Population Growth) */

public class WorldPopulationGrowth {

    public static void main(String[] args) {
        // Sample data (replace with your researched values)
        double currentPopulation = 8000000000.0; // Example: 8 billion
        double growthRate = 0.01; // Example: 1% growth rate
        double initialPopulation = currentPopulation;

        System.out.println("Year\tPopulation\tIncrease");

        int doublingYear = -1;

        for (int year = 1; year <= 75; year++) {
            double increase = currentPopulation * growthRate;
            currentPopulation += increase;

            System.out.printf("%d\t%.0f\t%.0f\n", year, currentPopulation, increase);

            if (doublingYear == -1 && currentPopulation >= 2 * initialPopulation) {
                doublingYear = year;
            }
        }

        if (doublingYear != -1) {
            System.out.println("The population will double in year: " + doublingYear);
        } else {
            System.out.println("The population will not double in 75 years with this growth rate.");
        }
    }
}