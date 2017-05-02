import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ErinGreenhalgh on 5/2/17.
 */
public class BottlesTest {
    @Test
    public void testFirstVerse() {
        String verse = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerse = b.verse(99);
        assertEquals(verse, expectedVerse);
    }

    @Test
    public void testAnotherVerse() {
        String verse = "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take one down and pass it around, 88 bottles of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerse = b.verse(89);
        assertEquals(verse, expectedVerse);
    }
}
