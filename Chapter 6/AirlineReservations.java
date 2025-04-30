// 6.18 Airline Reservations System


import java.util.Scanner;

public class AirlineReservations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // false = empty, true = occupied
        int firstClassCount = 0;
        int economyCount = 0;
        
        while (firstClassCount + economyCount < 10) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int choice = input.nextInt();
            
            if (choice == 1) { // First Class
                if (firstClassCount < 5) {
                    assignSeat(seats, firstClassCount, "First Class");
                    firstClassCount++;
                } else if (economyCount < 5) {
                    System.out.println("First Class is full. Would you like to be placed in Economy? (1 for Yes, 2 for No):");
                    int economyChoice = input.nextInt();
                    if (economyChoice == 1) {
                        assignSeat(seats, 5 + economyCount, "Economy");
                        economyCount++;
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                } else {
                    System.out.println("Sorry, the flight is full.");
                }
            } else if (choice == 2) { // Economy
                if (economyCount < 5) {
                    assignSeat(seats, 5 + economyCount, "Economy");
                    economyCount++;
                } else if (firstClassCount < 5) {
                    System.out.println("Economy is full. Would you like to be placed in First Class? (1 for Yes, 2 for No):");
                    int firstClassChoice = input.nextInt();
                    if (firstClassChoice == 1) {
                        assignSeat(seats, firstClassCount, "First Class");
                        firstClassCount++;
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                } else {
                    System.out.println("Sorry, the flight is full.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
        
        System.out.println("The flight is now full.");
    }
    
    public static void assignSeat(boolean[] seats, int seatNumber, String section) {
        if (!seats[seatNumber]) {
            seats[seatNumber] = true;
            System.out.println("You have been assigned Seat " + (seatNumber + 1) + " in " + section + ".");
            printBoardingPass(seatNumber + 1, section);
        } else {
            System.out.println("Seat " + (seatNumber + 1) + " is already occupied.");
        }
    }
    
    public static void printBoardingPass(int seatNumber, String section) {
        System.out.println("\n*** Boarding Pass ***");
        System.out.println("Seat: " + seatNumber);
        System.out.println("Section: " + section);
        System.out.println("********************\n");
    }
}