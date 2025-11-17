//The following tests ensure that the logic for counting lines of text and characters is correct.
package Finaluppgift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTest {

    // Test case to verify that lines and characters are counted correctly
    @Test
    public void addLines() {
        TextCounter counter = new TextCounter();  // Create a new LineCounter instance
        counter.addLine("Mambo");  // Add a line with the word "Mambo"
        counter.addLine("Thomas");  // Add another line with the word "Thomas"

        // Check that the line count is 2 and the total character count is 11 (5 + 6)
        assertEquals(2, counter.getLineCount());  // Two lines should be counted
        assertEquals(11, counter.getCharacterCount());  // "Mambo" + "Thomas" = 11 characters
    }

    // Test case to check how the program handles an empty line
    @Test
    public void testEmptyLines() {
        TextCounter counter = new TextCounter();  // Create a new LineCounter instance
        counter.addLine("");  // Add an empty line

        // Check that the line count is 1 and character count is 0 (empty line)
        assertEquals(1, counter.getLineCount());  // One empty line should be counted
        assertEquals(0, counter.getCharacterCount());  // No characters in an empty line
    }

    // Test case to ensure the program stops counting when "stop" is entered
    @Test
    public void testStopCondition() {
        TextCounter counter = new TextCounter();  // Create a new LineCounter instance
        counter.addLine("Inspiring teacher");  // Add a normal line
        counter.addLine("stop");  // Add the "stop" line (this is just counted, but the program stops after this)

        // Check that the program correctly counts 2 lines (even though the last is "stop")
        assertEquals(2, counter.getLineCount());  // Two lines should be counted, including the "stop" line
        assertEquals(21, counter.getCharacterCount());  // "Inspiring teacher" has 17 characters
    }
}
