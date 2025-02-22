import java.util.Random;

public class GameLogic {
    static String[] gameOptions = {"R", "P", "S"};

    public static void main(String[] args) {
        // Simple game of Rock, Paper, Scissors

        boolean run = true;
        int startGame = 1;
        int failedInput = 0;

        while(run) {

            if ( startGame == 1 ) {
                startGame = RunGame("Please choose from (P, R, S)");
                failedInput = 0;
            } else if (startGame == 2) {
                startGame = RunGame("Input not accepted, Please choose from (P, R, S)");
                failedInput++;
            }

            // if the user stops the game or fails to enter a valid input 3 times. The game will end
            if ( startGame == 3 || failedInput > 2 ) {
                run = false;
            }

        }

        LocalUtil.closeScanner();
    }

    public static int RunGame(String question) {
        String ComputerChoice = gameOptions[new Random().nextInt(gameOptions.length)];
        String UserChoice = LocalUtil.getInput(question);

        int gameStatus = 1;

        // This is making sure a valid game option was selected
        if (UserChoice.isEmpty() || UserChoice.equals("Y") ) {
            System.out.println("\n");
            gameStatus = 2;
        } else {
            System.out.println("Computer Chose: " + ComputerChoice);
            System.out.println("You Chose:" + UserChoice);

            String getResults = LocalUtil.checkResults(ComputerChoice, UserChoice);
            System.out.println(getResults);

            String playAgain = LocalUtil.getInput("\n Want to play again? ( Y/N )");
            // Note: if it s a N ( No ) it will return an empty string
            if ( !playAgain.equals("Y") ) {
                gameStatus = 3;
            }
        }

        return gameStatus;
    }
}