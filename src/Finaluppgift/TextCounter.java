// This class will manage the text/line count and the character count.
package Finaluppgift;

public class TextCounter {

    private int lineCount;  // Variable to store the number of lines(text)
    private int characterCount;  // Variable to store the total number of characters

    // Constructor to initialize counters
    public TextCounter() {
        this.lineCount = 0;  // Initialize line count to 0
        this.characterCount = 0;  // Initialize character count to 0
    }

    // Method to add a new line and update the line and character counts
    public void addLine(String line) {
        lineCount++;  // Increase line count by 1 for each new line
        characterCount += line.length();  // Add the length of the line to the total character count
    }

    // Get method to return the total number of lines
    public int getLineCount() {
        return lineCount;
    }

    // Get method to return the total number of characters
    public int getCharacterCount() {
        return characterCount;
    }


}
