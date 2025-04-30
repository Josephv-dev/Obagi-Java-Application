// 6.21 KnightsTour


import java.util.Random;

public class KnightsTour {

    private static int[][] board = new int[8][8];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        tourKnight();
    }

    public static void tourKnight() {
        int currentRow = 0;
        int currentColumn = 0;
        board[currentRow][currentColumn] = 1; // Start at 0,0
        int moveNumber = 1;
        Random random = new Random();

        while (moveNumber < 64) {
            int[] possibleMoves = getPossibleMoves(currentRow, currentColumn);
            if (possibleMoves.length == 0) {
                break; // No more moves
            }

            int nextMove = possibleMoves[random.nextInt(possibleMoves.length)]; // Random move
            currentRow += vertical[nextMove];
            currentColumn += horizontal[nextMove];
            moveNumber++;
            board[currentRow][currentColumn] = moveNumber;
        }

        printBoard();
        System.out.println("The knight made " + moveNumber + " moves.");
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

    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }
}