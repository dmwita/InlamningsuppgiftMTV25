package FinalUppgiftPart3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


 // Unit tests for TextCounter.
 // These tests check:
 // - Line counting
 // - Word counting
 // - Longest word detection
 // - Stop command behavior

public class TextCounterTest {

    @Test
    public void testLineCounting() {
        TextCounter c = new TextCounter();

        c.processLine("Mambo Thomas"); // Mambo = Hej in swahili
        c.processLine("MTV25");

        // 2 lines should be counted
        assertEquals(2, c.getLineCount());
    }

    @Test
    public void testWordLongestWord() {
        TextCounter c = new TextCounter();

        c.processLine("I love programming");

        // Expected word count should be 3
        assertEquals(3, c.getWordCount());

        // Longest word should be "programming"
        assertEquals("programming", c.getLongestWord());
    }

    @Test
    public void testStopStopsProcessing() {
        TextCounter c = new TextCounter();

        c.processLine("Mambo");
        c.processLine("stop");  // Should activate stop and not count
        c.processLine("This should NOT be counted");

        assertTrue(c.stopWasTyped());

        // Only the first line should be counted
        assertEquals(1, c.getLineCount());
    }
}
