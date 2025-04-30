// 6.20 TurtleGraphics

public class TurtleGraphics {

    private static int[][] floor = new int[20][20];
    private static int turtleRow = 0;
    private static int turtleCol = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0: east, 1: south, 2: west, 3: north

    public static void main(String[] args) {
        int[][] commands = {
                {2},
                {5, 12},
                {3},
                {5, 12},
                {3},
                {5, 12},
                {3},
                {5, 12},
                {1},
                {6},
                {9}
        };

        processCommands(commands);
        displayFloor();
    }

    public static void processCommands(int[][] commands) {
        for (int[] command : commands) {
            switch (command[0]) {
                case 1:
                    penUp();
                    break;
                case 2:
                    penDown();
                    break;
                case 3:
                    turnRight();
                    break;
                case 4:
                    turnLeft();
                    break;
                case 5:
                    moveForward(command[1]);
                    break;
                case 6:
                    displayFloor();
                    break;
                case 9:
                    break; // End of data
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    public static void penUp() {
        penDown = false;
    }

    public static void penDown() {
        penDown = true;
    }

    public static void turnRight() {
        direction = (direction + 1) % 4;
    }

    public static void turnLeft() {
        direction = (direction + 3) % 4;
    }

    public static void moveForward(int spaces) {
        for (int i = 0; i < spaces; i++) {
            switch (direction) {
                case 0: // East
                    if (turtleCol < 19) turtleCol++;
                    break;
                case 1: // South
                    if (turtleRow < 19) turtleRow++;
                    break;
                case 2: // West
                    if (turtleCol > 0) turtleCol--;
                    break;
                case 3: // North
                    if (turtleRow > 0) turtleRow--;
                    break;
            }
            if (penDown) {
                floor[turtleRow][turtleCol] = 1;
            }
        }
    }

    public static void displayFloor() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (floor[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}