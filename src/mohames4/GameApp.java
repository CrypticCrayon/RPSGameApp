/*
Name: Shanaz Mohamed
Project Description: Rock Paper Scissors game application. 
                     Let's you choose and play against computer's choice.
 */

package mohames4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Labyrinth
 */
public class GameApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello, Let’s play Rock, Paper, Scissors. Please enter 'y' for yes or 'n' for no");

        String playAgain;
        Scanner sc = new Scanner(System.in);
        playAgain = sc.nextLine();
        
        while(playAgain.equalsIgnoreCase("Y")){

            System.out.println("Enter R for Rock, P for paper, S for scissors");
            String playerChoice;
            playerChoice = sc.nextLine();
            if (!playerChoice.equalsIgnoreCase("R")&&
                !playerChoice.equalsIgnoreCase("P")&&
                !playerChoice.equalsIgnoreCase("S")){
                System.out.println("The entry is invalid. Please choose Rock(R) or Paper(P) or Scissors(S)"); 
            }else{

                Random randGen = new Random();
                int randomNum = randGen.nextInt(3);
                String computerChoice = "";

                switch(randomNum){
                    case 0:computerChoice = "R";
                           System.out.println("Computer choice is: " + computerChoice);
                           break;

                    case 1:computerChoice = "P";
                           System.out.println("Computer choice is: " + computerChoice);
                           break;

                    case 2:computerChoice = "S";
                           System.out.println("Computer choice is: " + computerChoice);
                           break;
                }

                //End case

                if (playerChoice.equalsIgnoreCase(computerChoice)){
                        System.out.println("Draw");
                } 
                else if(playerChoice.equals("R") && computerChoice.equals("S")|| playerChoice.equals("P") && computerChoice.equals("R")|| playerChoice.equals("S") && computerChoice.equals("P")){
                        System.out.println("You Win!"); 
                }

                else{	
                    System.out.println("You Lose!"); 
                }
                
                System.out.println("Want to play again? Enter 'Y' for yes and 'N' for no");
                playAgain = sc.nextLine();
            }   
        }
    }
}