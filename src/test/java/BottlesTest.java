import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testVerseTwo() {
        String verse = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerse = b.verse(2);
        assertEquals(verse, expectedVerse);
    }

    @Test
    public void testVerseOne() {
        String verse = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerse = b.verse(1);
        assertEquals(verse, expectedVerse);
    }

    @Test
    public void testVerseZero() {
        String verse = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerse = b.verse(0);
        assertEquals(verse, expectedVerse);
    }

    @Test
    public void testACoupleOfVerses() {
        String verses = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.\n\n" +
                "98 bottles of beer on the wall, 98 bottles of beer.\n" +
                "Take one down and pass it around, 97 bottles of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerses = b.verse(99, 98);
        assertEquals(verses, expectedVerses);
    }

    @Test
    public void testMultipleVerses() {
        String verses = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n\n"+
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        Bottles b = new Bottles();
        String expectedVerses = b.verse(2,0);
        assertEquals(verses, expectedVerses);
    }
//
//    @Ignore @Test
//    public void testTheWholeThing() {
//
//    }
}
