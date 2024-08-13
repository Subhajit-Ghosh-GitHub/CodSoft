import java.util.*;
import java.lang.Math;
public class Number_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int range = 100; // Range for random number
        int attempts, maxAttempts = 10; // Default max attempts
        int score=100, totalScore ,scorezero=0;
        boolean playAgain;

        do {
            // Generate a random number between 1 and 100
            double temp = Math.random();
            double temp1 = temp * 100;
            int numberToGuess = (int) temp1;

            // Get user choice for number of attempts
            System.out.println("Enter 1 for limited attempts or 2 for unlimited attempts:");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter how many attempts you want (max " + maxAttempts + "):");
                attempts = sc.nextInt();
                if (attempts > maxAttempts) {
                    System.out.println("The number of attempts cannot exceed ! so limited maximum Attemps is within " + maxAttempts + " Not " + attempts + ".");
                    attempts = maxAttempts;
                }
            } else {
                attempts = Integer.MAX_VALUE; // Unlimited attempts
              
            }

            int attemptCount = 0;
            boolean guessedCorrectly = false;

            while (attemptCount < attempts) {
                System.out.println("Enter your guess (between 1 and " + range + "):");
                int guess = sc.nextInt();
                attemptCount++;

                if (guess == numberToGuess) {
                    System.out.println("Hurray! Your guess is correct!");
                    guessedCorrectly = true;
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
                totalScore=scorezero;
            }
            else {

                int nscore = 2 * attemptCount;
                totalScore = score - nscore;
            }

            System.out.println("Final Score for this Round is: " + totalScore);

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (yes/no):");
            String response = sc.next().trim().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thank you for playing! ");
        sc.close();
    }
}
