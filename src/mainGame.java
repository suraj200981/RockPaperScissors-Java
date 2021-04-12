import java.util.Scanner;

public class mainGame {
    public static void main(String[] args) {
        rockPaperScissorsGame();
    }


    public static void menu() {

        System.out.println("Main Menu");
        System.out.println();
    }

    public static void rockPaperScissorsGame() {

        int computerValue = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1); // the computer choice

        int playerScore = 0;
        int computerScore = 0;

        System.out.println();
        System.out.println(computerValue);
        System.out.println("Select below:");

        System.out.println();
        System.out.println("[R] - Rock [P]- Paper [S]- Scissors");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        if (userInput.toLowerCase().equals("r") && computerValue == 1) {

        }


    }
}
