// GenderNeutralText.java
import java.util.Scanner;

public class GenderNeutralText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a paragraph:");
        String text = input.nextLine();
        
        // Replace gendered terms
        text = text.replaceAll("husband|wife", "spouse")
                   .replaceAll("man|woman", "person")
                   .replaceAll("son|daughter", "child")
                   .replaceAll("he|she", "they")
                   .replaceAll("his|her", "their");
        
        System.out.println("\nGender-neutral paragraph:");
        System.out.println(text);
        
        input.close();
    }
}