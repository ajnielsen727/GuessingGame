/*
Week 1 Code
AJ Nielsen
Guessing Game
 */
import java.util.Scanner;


public class GuessingGame {

    public static void main(String[] args) {
        
        int randNum = (int) (Math.random() * 50 + 1);
        
        System.out.println("Pick a number between 1-50.");
        while(true){
            int guess = new Scanner(System.in).nextInt();
            if (guess == randNum){
                System.out.println("Your guess is correct!");
                break;
            }
            else if (guess > randNum){
                System.out.println("Incorrect, your guess is too high. Please try again: ");
            }
            else{
                System.out.println("Incorrect, your guess is too low. Please try again: ");
            }
            
        }
        
    }
    
}
