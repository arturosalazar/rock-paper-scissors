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

        scanner.close();
    }
}