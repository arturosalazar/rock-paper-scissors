import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args){
        //Computer selects move
        String[] computerMoves = {"r", "p", "s"};
        String computerSelection = computerMoves[new Random().nextInt(computerMoves.length)];
        //User selects move
        Scanner scanner = new Scanner(System.in);
        String userSelection;
        while(true){
            //Check that move is valid
            while(true){
                System.out.print("Select a move: r, p, s: ");
                userSelection = scanner.nextLine();
                userSelection = userSelection.toLowerCase();
                if(userSelection.equals("r") || userSelection.equals("p") || userSelection.equals("s")){
                    break;
                }
                System.out.println(userSelection + "is not a valid selection");
            }

            //Print each player's move to make it clear what has happened
            System.out.println("*************************");
            System.out.println("Computer's Move: " + computerSelection);
            System.out.println("Player's Move: " + userSelection);

            //Compare the moves to determine result and print result
            //Draw Condition
            if(userSelection.equals(computerSelection)){
                System.out.println("It's a draw!");
            }
            //Player Chooses "r"
            else if (userSelection.equals("r")){
                if(computerSelection.equals("p")){
                    System.out.println("Computer wins! Paper beats Rock");
                }
                if(computerSelection.equals("s")){
                    System.out.println("User wins! Rock beats Scissors");
                }
            }
            //Player Chooses "p"
            else if (userSelection.equals("p")){
                if(computerSelection.equals("s")){
                    System.out.println("Computer wins! Scissors beats Paper");
                }
                if(computerSelection.equals("r")){
                    System.out.println("User wins! Paper beats Rock");
                }
            }
            //Player Chooses "s"
            else if (userSelection.equals("s")){
                if(computerSelection.equals("r")){
                    System.out.println("Computer wins! Rock beats Scissors");
                }
                if(computerSelection.equals("p")){
                    System.out.println("User wins! Scissors beats Paper");
                }
            }

            System.out.println("Would you like to play again? y/n");
            String playAgain = scanner.nextLine();
            playAgain = playAgain.toLowerCase();
            if (!(playAgain.equals("y") || playAgain.equals("yes"))){
                System.out.println("Thank you for playing!");
                break;
            }
        }
        
        scanner.close();
    }
}