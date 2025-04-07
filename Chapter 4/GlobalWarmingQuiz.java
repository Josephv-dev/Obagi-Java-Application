import java.util.Scanner;

public class GlobalWarmingQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        String[][] questions = {
                {"1. What is the primary greenhouse gas?",
                        "1. Oxygen", "2. Carbon Dioxide", "3. Nitrogen", "4. Hydrogen"},
                {"2. Which of these is a potential effect of global warming?",
                        "1. Lower sea levels", "2. Increased polar ice", "3. More frequent heatwaves", "4. Decreased storm intensity"},
                {"3. What is a major source of carbon dioxide emissions?",
                        "1. Solar power", "2. Wind turbines", "3. Burning fossil fuels", "4. Planting trees"},
                {"4. What international agreement aimed to reduce greenhouse gas emissions?",
                        "1. The Kyoto Protocol", "2. The Geneva Convention", "3. The Paris Agreement", "4. Both 1 and 3"},
                {"5. Which of the following is a renewable energy source?",
                        "1. Coal", "2. Natural Gas", "3. Oil", "4. Solar"},
        };

        int[] correctAnswersKey = {2, 3, 3, 4, 4};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]); // Print the question
            for (int j = 1; j < questions[i].length; j++) {
                System.out.println(questions[i][j]); // Print the choices
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == correctAnswersKey[i]) {
                correctAnswers++;
            }
        }

        System.out.println("You got " + correctAnswers + " questions correct.");

        if (correctAnswers == 5) {
            System.out.println("Excellent!");
        } else if (correctAnswers == 4) {
            System.out.println("Very good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Here are some websites to get you started:");
            System.out.println("-   [A reputable environmental website]");
            System.out.println("-   [Another reputable science website]");
        }
    }
}