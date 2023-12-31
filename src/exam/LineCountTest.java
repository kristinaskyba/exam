package exam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LineCountTest {
    @Test
    public void testEnteredText() { //Printing new line if stop is not used
        TextPrinter test = new TextPrinter();
        String expected = "Java is killing me :=)";
        String actual = test.readAndOutputText("no. it's not");
        assertEquals(expected, actual);
    }

    @Test
    public void testStopWord() { //Not printing line if STOP used
        TextPrinter test = new TextPrinter();
        String expected = "";
        String actual = test.readAndOutputText("printing line if stop not used");
        assertEquals(expected, actual);
    }

    @Test
    public void testLineCount() { //Testing if its calculating lines
        TextPrinter calc = new TextPrinter();
        calc.getTextInfo("Line Number 1");
        calc.getTextInfo("Ohhh I'm so tired to type");
        calc.getTextInfo("Ohhh Line number 3");
        int actual = calc.lineCount;
        assertEquals(4, actual);
    }

    @Test
    public void testWordCount() { //Testing if its calculating words
        TextPrinter calc = new TextPrinter();
        calc.getTextInfo("Really? you scrolled up to here?");
        int actual = calc.wordCount;
        assertEquals(6, actual);
    }

    @Test
    public void testSymbolCount() { //Testing if its calculating symbols
        TextPrinter calc = new TextPrinter();
        calc.getTextInfo("Aren't you tired already?");
        int expected = 19;
        int actual = calc.totalCharacters;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord() { //Testing if it's printing the longest word
        TextPrinter calc = new TextPrinter();
        calc.getTextInfo("Find the loooongest word");
        String actual = calc.longest;
       assertEquals("loooongest", actual);
    }

    @Test
    public void testBooleanStopWord() { //Testing if boolean is working
        TextPrinter calc = new TextPrinter();
        calc.setStopWord(false);//when stop word set to true, isOne returns true
        assertTrue("If you see this message, then boolean is not set to true", calc.isOne());
    }
}
