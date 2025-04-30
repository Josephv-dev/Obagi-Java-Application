// 6.22 KnightsTourBruteForce

import java.util.Random;

public class KnightsTourBruteForce {

    private static int[][] board = new int[8][8];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static Random random = new Random();
    private static int[] tourLengths = new int[65]; // Keep track of tour lengths

    public static void main(String[] args) {
        //a
        //runOneTour();
        //b
        runMultipleTours(1000);
        //c
        //runUntilFullTour();

    }

    public static void runOneTour() {
        initializeBoard();
        int moves = tourKnight();
        printBoard();
        System.out.println("The knight made " + moves + " moves.");
    }

    public static void runMultipleTours(int numberOfTours) {
        for (int i = 0; i < numberOfTours; i++) {
            initializeBoard();
            int moves = tourKnight();
            tourLengths[moves]++;
        }
        printTourLengthStatistics();
    }

    public static void runUntilFullTour() {
        int tours = 0;
        while (true) {
            tours++;
            initializeBoard();
            int moves = tourKnight();
            tourLengths[moves]++;
            if (moves == 64) {
                System.out.println("Full tour found after " + tours + " tours.");
                printTourLengthStatistics();
                printBoard();
                break;
            }
        }
    }

    public static int tourKnight() {
        int currentRow = 0;
        int currentColumn = 0;
        board[currentRow][currentColumn] = 1;
        int moveNumber = 1;

        while (moveNumber < 64) {
            int[] possibleMoves = getPossibleMoves(currentRow, currentColumn);
            if (possibleMoves.length == 0) {
                break;
            }

            int nextMove = possibleMoves[random.nextInt(possibleMoves.length)];
            currentRow += vertical[nextMove];
            currentColumn += horizontal[nextMove];
            moveNumber++;
            board[currentRow][currentColumn] = moveNumber;
        }
        return moveNumber;
    }

    public static int[] getPossibleMoves(int row, int col) {
        int[] moves = new int[8];
        int count = 0;

        for (int moveType = 0; moveType < 8; moveType++) {
            int nextRow = row + vertical[moveType];
            int nextCol = col + horizontal[moveType];

            if (isSafe(nextRow, nextCol)) {
                moves[count++] = moveType;
            }
        }

        int[] validMoves = new int[count];
        System.arraycopy(moves, 0, validMoves, 0, count);
        return validMoves;
    }

    public static boolean isSafe(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8 && board[row][col] == 0;
    }

    public static void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void printTourLengthStatistics() {
        System.out.println("Tour Length | Frequency");
        System.out.println("------------|----------");
        for (int i = 1; i <= 64; i++) {
            if (tourLengths[i] > 0) {
                System.out.println("     " + i + "     |     " + tourLengths[i]);
            }
        }
    }
}