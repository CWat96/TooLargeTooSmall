import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args){

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random number is " + randomNumber);
        int tryCount = 0;
        while(true) {
            System.out.println("Enter your guess (1-100):");

        int playerGuess = scanner.nextInt();
        tryCount++;

        if (playerGuess == randomNumber) {
            System.out.println("Correct guess!");
            System.out.println("It took you " + tryCount + " tries");
            break;
        }
        else if (randomNumber > playerGuess) {
            System.out.println("Too small. Guess again.");
        }
        else {
            System.out.println("Too large. Guess again.");
        }
    }


        scanner.close();
}
}
