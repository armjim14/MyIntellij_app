import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LocalUtil {

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
        } else if ( c.equals("P") ) {
            if ( p.equals("S") ) {
                return "You Win!";
            } else {
                return "You Lost!";
            }
        } else {
            if ( p.equals("R") ) {
                return "You Win!";
            } else {
                return "You Lost!";
            }
        }
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
