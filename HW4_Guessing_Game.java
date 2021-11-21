// Theodora Cohn
// CS 141
// HW Core Topics: 
//
// This program will...play a number-guessing game with hinting between 1-100.
import java.util.*;
import java.io.*;
 
public class HW4_Guessing_Game {

   public static final int MAX = 200;
   
   public static void main(String[] args) {
      
      // variables used between methods
      int totalGuesses;
      int numGames;
      int leastGuesses;
            
      guessingGame();
      

      
      // play again?
         
         Scanner console = new Scanner(System.in);
         
         char first = 'y';
         
         while (first == 'y') {
         
            
            System.out.print("Do you want to play again? ");
            
            String answer = console.next();
            first = answer.charAt(0);
            System.out.println();
            
            if (first == 'y') {
               guessingGame();
            }
         }
   
   }
   //intro to the game
   public static void intro() {
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("It will think of a number between 1 and "+ MAX +".");
      System.out.println("and will allow you to guess until you get the number.");
      System.out.println("For each guess, it will tell you whether you have");
      System.out.println("guessed too high or too low.");
      System.out.println();

   }
   
   
   public static void guessingGame() {
      
      Scanner scan = new Scanner(System.in);
   
      // pick a random number from 1 to 100 inclusive
      Random rand = new Random();
         int number = rand.nextInt(MAX) + 1;
         
      // first guess
      System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
      System.out.print("Your guess? ");
         int guess = scan.nextInt();
         int numGuesses = 1;
         
      //subsequent guesses
      while (guess != number) { 
         if (numGuesses < MAX) {
         //hints
            if (guess > number) {
               System.out.println("Too high!");
            }
            else if (guess < number) {
               System.out.println("Too low!");
            }
            //new guess    
            System.out.print("Your guess? "); 
            guess = scan.nextInt(); 
            numGuesses++;
         }
      }
   
      System.out.println();
               
      //game won!   
      if (numGuesses > 1) {
         System.out.println("You got it right in " + numGuesses + " tries.");
      }
      //special win
      else {
         System.out.println("You got it right on the first guess!!");
      }
      
      
      totalGuesses += numGuesses
      numGames += 1;

   }
   
   public static void gameStats() {
   //public static void gameStats(final numGames, final numGuesses, final leastGuesses) {
      
      double average = numGuesses / numGames;
      
      
      System.out.println("Game statistics:");
      System.out.println();
      System.out.println("games          = " + numGames);
      System.out.println("guesses        = " + totalGuesses);
      System.out.println("guesses/game   = " + average);
      System.out.println("fewest guesses = " + leastGuesses);
   }
}