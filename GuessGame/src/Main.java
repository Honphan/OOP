//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");
      Player player3 = new Player("Player 3");
      Guess guess = new Guess(player1, player2, player3);
      guess.startGame();
        if (guess.winner.isEmpty()) {
            System.out.println("No one won the game!");
        } else if (guess.winner.size() == 1) {
            System.out.println(guess.winner.get(0).getName() + " won the game!");
        } else {
            System.out.println("Player winners: " +
                    guess.winner.stream()
                            .map(Player::getName)
                            .collect(Collectors.joining(", ")));
        }
    }
}