import java.util.Random;

public class GameLogic {

    static String[] gameOptions = {"R", "P", "S"};

    public static void main(String[] args) {
        // Simple GUI game of Rock, Paper, Scissors
        JfxStuff.runProgram(args);
    }

    public static String runUserInput(int action){
        String ComputerChoice = gameOptions[new Random().nextInt(gameOptions.length)];
        String userChoice = gameOptions[action];

        return LocalUtil.checkResults(ComputerChoice, userChoice);
    }
}