import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int randomNumber = random.nextInt(101); // Generates a random number between 0 and 100

                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("I have selected a number between 0 and 100 (inclusive).");

                int userGuess;
                int attempts = 0;

                do {
                        System.out.print("Enter your guess: ");
                        userGuess = scanner.nextInt();
                        attempts++;

                        if (userGuess < randomNumber) {
                                System.out.println("Your guess is too low.");
                        } else if (userGuess > randomNumber) {
                                System.out.println("Your guess is too high.");
                        } else {
                                System.out.println("Congratulations! You guessed the number " + randomNumber + " in "
                                                + attempts + " attempts.");
                        }
                } while (userGuess != randomNumber);

                scanner.close();
        }
}
