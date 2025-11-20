package FinalUppgiftPart3;

import java.util.Scanner;

/**
 * TextReader handles:
 *  - Reading input from the user
 *  - Sending each line to TextCounter
 *  - Stopping when the user types "stop"
 *  - Printing the final results
 *
 * NO counting logic should be in this class.
 */
public class TextReader {

    private TextCounter counter;

    /**
     * Constructor that receives the logic class.
     */
    public TextReader(TextCounter counter) {
        this.counter = counter;
    }

    /**
     * Starts reading from the terminal until "stop" is typed.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (type 'stop' to finish):");

        while (true) {
            String line = scanner.nextLine();

            // Send the line to the logic class
            counter.processLine(line);

            // If "stop" was detected inside the counter, break the loop
            if (counter.stopWasTyped()) {
                break;
            }
        }

        // Print all results
        System.out.println("Lines: " + counter.getLineCount());
        System.out.println("Characters: " + counter.getCharCount());
        System.out.println("Words: " + counter.getWordCount());
        System.out.println("Longest word: " + counter.getLongestWord());
    }

    public static void main(String[] args) {
        TextCounter counter = new TextCounter();
        TextReader reader = new TextReader(counter);
        reader.start();
    }
}
