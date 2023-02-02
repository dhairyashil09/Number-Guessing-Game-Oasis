import java.util.Scanner;
 
public class GuessNumber {
    public static void guessingNumberGame()
    {
        
        Scanner sc = new Scanner(System.in);
       
        int number = 1 + (int)(100* Math.random());
        int K = 5;
        int i, guess;
 
        System.out.println(
            "Choose Number"
            + " between 1 to 100."
            + "\nGuess the number"
            + " within 5 trials.");
 

        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
            
            guess = sc.nextInt();
            
            if (number == guess) {
                System.out.println(
                    "Nice!!!... Congratulations!"
                    + " You guessed Correct number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "Try again !!!.... The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println( 
                    "Try again !!!....The number is"
                    + " less than " + guess);
            }
        }
 

        if (i == K) {
            System.out.println( "Your limit excided"
                + " K trials.");
 
            System.out.println(
                "The number was " + number);
        }
    }    
    public static void main(String arg[])
    {
 
        
        guessingNumberGame();
    }
}