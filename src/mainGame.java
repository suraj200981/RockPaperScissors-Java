import java.io.IOException;
import java.util.Scanner;

public class mainGame {

    public static int playerScore = 0;
    public static int computerScore = 0;
    public static String gameResult = "";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";



    public static void main(String[] args) throws IOException {

        for (int x = 1; x <= 3; x++) {
            rockPaperScissorsGame();
            if (x == 3) {
                System.out.println("The game is now over, ");
                System.out.println("press any key to reveal who won...");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
            }
            for (int i = 0; i < 30; ++i) {
                System.out.println();
            }
            if (x == 3) {
                System.out.println("Final scores : Your score = " + playerScore + "   Computer score = " + computerScore); //print scores
                if (playerScore < computerScore) {
                    System.out.println("Computer Wins :(");
                } else if (playerScore > computerScore) {
                    System.out.println("You Win!! :) ");

                } else if (playerScore == computerScore) {
                    System.out.println("It was a draw :|");
                }
            }
        }

    }


    public static void menu() {

        System.out.println("Main Menu");
        System.out.println();
    }


    public static void rockPaperScissorsGame() {

        int computerValue = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1); // the computer choice

        System.out.println(gameResult);
        System.out.println("Your score = " + playerScore + "   Computer score = " + computerScore); //print scores
        System.out.println();
        System.out.println("Select below:");

        System.out.println();
        System.out.println("[R] - Rock [P]- Paper [S]- Scissors");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        if (userInput.toLowerCase().equals("r") && computerValue == 1) { // rock vs rock
            System.out.println("draw");
            gameResult = "Last game result: You chose rock and the computer chose rock, it was a draw";
        } else if (userInput.toLowerCase().equals("r") && computerValue == 2) { // rock vs paper
            System.out.println("You lose!");
            gameResult = "Last game result: You chose rock and the computer chose paper, "+ANSI_RED+"you lost"+ANSI_RESET;
            computerScore++;
        } else if (userInput.toLowerCase().equals("r") && computerValue == 3) { // rock vs scissors
            System.out.println("You win!");
            gameResult = "Last game result: You chose rock and the computer chose scissors,"+ANSI_GREEN+" you won"+ANSI_RESET;
            playerScore++;
        }

        /*user chooses paper*/
        if (userInput.toLowerCase().equals("p") && computerValue == 1) { // paper vs rock
            System.out.println("You win!");
            gameResult = "Last game result: You chose paper and the computer chose rock,"+ANSI_GREEN+" you won"+ANSI_RESET;
            playerScore++;
        } else if (userInput.toLowerCase().equals("p") && computerValue == 2) { // paper vs paper
            System.out.println("draw");
            gameResult = "Last game result: You chose paper and the computer chose paper, it was a draw";
        } else if (userInput.toLowerCase().equals("p") && computerValue == 3) { // paper vs scissors
            System.out.println("You lose!");
            gameResult = "Last game result: You chose paper and the computer chose scissors, "+ANSI_RED+"you lost"+ANSI_RESET;
            computerScore++;
        }

        if (userInput.toLowerCase().equals("s") && computerValue == 1) { // paper vs rock
            System.out.println("You lose!");
            gameResult = "Last game result: You chose scissors and the computer chose rock,"+ANSI_RED+"you lost"+ANSI_RESET;
            computerScore++;
        } else if (userInput.toLowerCase().equals("s") && computerValue == 2) { // scissors vs paper
            System.out.println("You win!");
            gameResult = "Last game result: You chose scissors and the computer chose paper, "+ANSI_GREEN+" you won"+ANSI_RESET;
        } else if (userInput.toLowerCase().equals("s") && computerValue == 3) { // scissors vs scissors
            System.out.println("draw");
            gameResult = "Last game result: You chose scissors and the computer chose scissors, it was a draw";
        }
    }
}
