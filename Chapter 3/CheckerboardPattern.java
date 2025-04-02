// Chapter 3.22 - Exercise 2 ( Checkerboard Pattern  )//


public class CheckerboardPattern {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}