import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LocalUtil {
    static Scanner MakeObj = new Scanner(System.in);

    public static String checkResults(String c, String p) {
        if ( c.equals(p) ) {
            return "Tied Game";
        }

        if ( c.equals("R") ) {
            if ( p.equals("P") ) {
                return "You Win!";
            } else {
                return "You Lost!";
            }
        }

        if ( c.equals("P") ) {
            if ( p.equals("S") ) {
                return "You Win!";
            } else {
                return "You Lost!";
            }
        }

        if ( c.equals("S") ) {
            if ( p.equals("R") ) {
                return "You Win!";
            } else {
                return "You Lost!";
            }
        }

        // With logic in while loop in Main.java, this should not be reached.
        return "This should not display";
    }

    public static String getInput(String question) {
        System.out.println(question);
        String getResponse = MakeObj.nextLine();

        Boolean isResponseGood = checkResponse(getResponse);

        if ( !isResponseGood ) {
            getResponse = "";
        }

        return getResponse.toUpperCase();
    }

    public static void closeScanner() {
        MakeObj.close();
    }

    private static Boolean checkResponse(String response) {
        Boolean rtn = false;

        String[] allowedLetters = {"R", "P", "S", "Y"};

        for ( int i = 0; i < allowedLetters.length; i++ ) {
            if ( response.toUpperCase().equals(allowedLetters[i]) ) {
                rtn = true;
            }
        }

        return rtn;
    }

    public static void writeToFile(String str) {
        String fileName = "C:\\Users\\ajime\\OneDrive\\Documents\\CodeLogger\\log.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
