public class FacebookGrowth {

    public static void main(String[] args) {
        double initialUsers = 1000000000.0; // 1 billion
        double targetUsers1 = 1500000000.0; // 1.5 billion
        double targetUsers2 = 2000000000.0; // 2 billion
        double growthRate = 0.04; // 4% per month

        int monthsTo15Billion = calculateMonths(initialUsers, targetUsers1, growthRate);
        int monthsTo2Billion = calculateMonths(initialUsers, targetUsers2, growthRate);

        System.out.println("Months to reach 1.5 billion users: " + monthsTo15Billion);
        System.out.println("Months to reach 2 billion users: " + monthsTo2Billion);
    }

    public static int calculateMonths(double initialUsers, double targetUsers, double growthRate) {
        int months = 0;
        double currentUsers = initialUsers;

        while (currentUsers < targetUsers) {
            currentUsers += currentUsers * growthRate;
            months++;
        }
        return months;
    }
}