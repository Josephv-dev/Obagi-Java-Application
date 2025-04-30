// 6.23 EightQueens

import java.util.Random;

public class EightQueens {

    static int[] queens = new int[8]; // Column position for each row
    static boolean solutionFound = false;

    public static void main(String[] args) {
        solveQueens(0);
    }

    static void solveQueens(int row) {
        if (row == 8) {
            printSolution();
            solutionFound = true;
            return;
        }

        for (int col = 0; col < 8; col++) {
            queens[row] = col;
            if (isValidPlacement(row)) {
                solveQueens(row + 1);
            }
        }
    }

    static boolean isValidPlacement(int row) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == queens[row] ||