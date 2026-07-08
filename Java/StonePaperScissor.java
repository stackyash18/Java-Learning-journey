import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int noOfRounds = 1;
        int userScore = 0;
        int systemScore = 0;

        // 0-Stone,

        // 1-Paper,

        // 2-Scissor

        while (noOfRounds <= 3) {

            int systemNumber = rand.nextInt(3); // 0,1,2

            System.out.print("Round " + noOfRounds + " Enter (0-Stone, 1-Paper, 2-Scissor): ");
            int number = input.nextInt();

            if (number < 0 || number > 2) {
                System.out.println("Invalid input! Please enter 0, 1, or 2.");
                continue;
            }

            System.out.println("System chose: " + systemNumber);

            if (systemNumber == number) {
                System.out.println("Tie!");
            } else if (systemNumber == 0 && number == 1)
                userScore++;
            else if (systemNumber == 0 && number == 2)
                systemScore++;
            else if (systemNumber == 1 && number == 0)
                systemScore++;
            else if (systemNumber == 1 && number == 2)
                userScore++;
            else if (systemNumber == 2 && number == 0)
                userScore++;
            else if (systemNumber == 2 && number == 1)
                systemScore++;

            noOfRounds++;
            System.out.println();
        }

        System.out.println("User Score: " + userScore);
        System.out.println("System Score: " + systemScore);

        if (systemScore > userScore) {
            System.out.println("System wins the game!");
        } else if (userScore > systemScore) {
            System.out.println("User wins the game!");
        } else if (userScore == systemScore) {
            System.out.println("The Game is Tied!");
        }

        input.close();

    }
}
