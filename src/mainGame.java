import java.io.IOException;
import java.util.Scanner;

public class mainGame {

   public static int playerScore = 0;
  public static int computerScore = 0;
  public static String gameResult ="";
    public static void main(String[] args) throws IOException {

        for(int x=0; x<3; x++) {
            rockPaperScissorsGame();
         for (int i = 0; i < 30; ++i) System.out.println();

        }
    }



    public static void menu() {

        System.out.println("Main Menu");
        System.out.println();
    }


    public static void rockPaperScissorsGame() {

        int computerValue = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1); // the computer choice

        System.out.println(gameResult);
        System.out.println("Your score = "+playerScore+"   Computer score = "+computerScore); //print scores
        System.out.println();
        System.out.println("Select below:");

        System.out.println();
        System.out.println("[R] - Rock [P]- Paper [S]- Scissors");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        if (userInput.toLowerCase().equals("r") && computerValue == 1) { // rock vs rock
            System.out.println("draw");
            gameResult="Last game result: You chose rock and the computer chose rock, it was a draw";
        }else if (userInput.toLowerCase().equals("r") && computerValue == 2){ // rock vs paper
            System.out.println("You lose!");
            gameResult="Last game result: You chose rock and the computer chose paper, you lost";
            computerScore++;
        }else if (userInput.toLowerCase().equals("r") && computerValue == 3){ // rock vs scissors
            System.out.println("You win!");
            gameResult="Last game result: You chose rock and the computer chose scissors, you won";
            playerScore++;
        }

        /*user chooses paper*/
        if (userInput.toLowerCase().equals("p") && computerValue == 1) { // paper vs rock
            System.out.println("You win!");
            gameResult="Last game result: You chose paper and the computer chose rock, you won";
        }else if (userInput.toLowerCase().equals("p") && computerValue == 2){ // paper vs paper
            System.out.println("draw");
            gameResult="Last game result: You chose paper and the computer chose paper, it was a draw";
            computerScore++;
        }else if (userInput.toLowerCase().equals("p") && computerValue == 3){ // paper vs scissors
            System.out.println("You lose!");
            gameResult="Last game result: You chose paper and the computer chose scissors, you lose";
            playerScore++;
        }

        if (userInput.toLowerCase().equals("p") && computerValue == 1) { // paper vs rock
            System.out.println("You win!");
            gameResult="Last game result: You chose paper and the computer chose rock, you won";
        }else if (userInput.toLowerCase().equals("p") && computerValue == 2){ // paper vs paper
            System.out.println("draw");
            gameResult="Last game result: You chose paper and the computer chose paper, it was a draw";
            computerScore++;
        }else if (userInput.toLowerCase().equals("p") && computerValue == 3){ // paper vs scissors
            System.out.println("You lose!");
            gameResult="Last game result: You chose paper and the computer chose scissors, you lose";
            playerScore++;
        }
    }
}
