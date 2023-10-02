import java.util.Random;

public class RockPaperScissors {
    public static void main (String[] args){
        //Computer selects move
        String[] computerMoves = {"r", "p", "s"};
        String computerSelection = computerMoves[new Random().nextInt(computerMoves.length)];
    }
}