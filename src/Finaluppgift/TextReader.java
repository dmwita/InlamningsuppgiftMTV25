//This class handles user input and stops when the word "stop" is typed.

package Finaluppgift;

import java.util.Scanner;

public class TextReader {

    private TextCounter counter;  // Counter object to track lines and characters

    // Constructor that initializes the Counter object
    public TextReader(TextCounter counter) {
        this.counter = counter;  // Assign the passed LineCounter instance to the member variable
    }

    // Method to read text input from the user
    public void readText() {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object to read input from the console
        System.out.println("Enter text (type 'stop' to finish):");
        String line;  // Variable to store each line of input from the user

        // Start reading lines in a loop until the word "stop" is typed
        while (true) {
            line = scanner.nextLine();

            // Check if the user wants to stop
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            // Send line to the counter class
            counter.addLine(line);

        }

        // Print the final count of lines and characters
        System.out.println("Number of lines: " + counter.getLineCount());  // Output the total number of lines
        System.out.println("Total characters: " + counter.getCharacterCount());  // Output the total character count
    }
    // Main method: Creates a TextCounter and starts TextReader loop.
    public static void main(String[] args){
        TextCounter counter = new TextCounter();
        TextReader textReader = new TextReader(counter); // pass counter to the reader

        textReader.readText();
    }
}
