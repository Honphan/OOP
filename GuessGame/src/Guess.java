import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    Player player1;
    Player player2;
    Player player3;
    List<Player> winner = new ArrayList<>();

    public Guess(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    public void startGame(){
        Random rn = new Random();
        int gameNumber = rn.nextInt(10) + 1;
        System.out.println("The game number is " + gameNumber);

        System.out.println("Player 1 guess the number between 1 and 10");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        player1.setNumber(number1);
        if(number1 == gameNumber){
            winner.add(player1);
        }

        System.out.println("Player 2 guess the number between 1 and 10");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        player2.setNumber(number2);
        if(number2 == gameNumber){
            winner.add(player2);
        }

        System.out.println("Player 3 guess the number between 1 and 10");
        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();
        player3.setNumber(number3);
        if(number3 == gameNumber){
            winner.add(player3);
        }



    }
}
