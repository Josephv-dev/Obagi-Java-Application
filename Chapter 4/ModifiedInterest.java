public class ModifiedInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        int years = 10;

        for (int rate = 5; rate <= 10; rate++) {
            double interestRate = rate / 100.0; //Convert percentage to decimal
            System.out.printf("Interest Rate: %d%%\n", rate);
            System.out.printf("%4s%20s\n", "Year", "Amount on deposit");

            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + interestRate, year);
                System.out.printf("%4d%20.2f\n", year, amount);
            }
        }
    }
}