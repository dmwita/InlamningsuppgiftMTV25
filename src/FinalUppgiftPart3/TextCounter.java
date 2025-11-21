package FinalUppgiftPart3;

// TextCounter handles all logic for Part 3:
// - Counting lines, characters, words
// - Finding the longest word
// - Detecting the stop command
// This class does NOT handle input/output.

public class TextCounter {

    // Attributes (object state)
    private int lineCount = 0;
    private int charCount = 0;
    private int wordCount = 0;
    private String longestWord = "";
    private boolean stopTyped = false;

    // Processes a single line of text
    public void processLine(String line) {

        // If stop was already typed earlier, ignore all further lines
        if (stopTyped) {
            return;
        }

        // If the user types "stop" now → activate stop and ignore this line
        if (line.equalsIgnoreCase("stop")) {
            stopTyped = true;
            return;
        }

        // Count the line
        lineCount++;

        // Count characters
        charCount += line.length();

        // Split on any amount of whitespace, not just one space
        String[] words = line.trim().split("\\s+");

        for (String w : words) {
            if (w.isEmpty())
                continue;

            wordCount++;

            // Track the longest word
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }
    }

    // Get/return desired outcome
    public boolean stopWasTyped() {
        return stopTyped;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}

