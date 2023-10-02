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
        //Check that move is valid
        while(true){
            System.out.println("Select a move: r, p, s");
            userSelection = scanner.nextLine();
            if(userSelection.equals("r") || userSelection.equals("p") || userSelection.equals("s")){
                break;
            }
            System.out.println(userSelection + "is not a valid selection");
        }

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
        scanner.close();
    }
}