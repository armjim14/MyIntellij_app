import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LocalUtil {

    public static String checkResults(String c, String p) {

        String theResults;

        // if both choices are the same, tied game
        if ( c.equals(p) ) {
            theResults = "Tied Game";
        }

        if ( c.equals("R") ) {
            if ( p.equals("P") ) {
                theResults = "You Win!";
            } else {
                theResults = "You Lost!";
            }
        } else if ( c.equals("P") ) {
            if ( p.equals("S") ) {
                theResults = "You Win!";
            } else {
                theResults = "You Lost!";
            }
        } else {
            if ( p.equals("R") ) {
                theResults = "You Win!";
            } else {
                theResults = "You Lost!";
            }
        }

        theResults = "\n\n" + theResults;

        return theResults;
    }

    // A simple logging method to a local file
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
