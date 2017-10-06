import static org.junit.Assert.*;

public class UniqueCharsTest {
    @org.junit.Test
    public void uniqueCharacters() throws Exception {

        String test = "anagram";

        assertEquals("n,g,r,m", "n,g,r,m");
    }

    @org.junit.Test
    public void uniqueCharacters1() throws Exception {

        String test = "anagram";

        assertEquals("n,g,r,m", "n,g,r,v");
    }

    @org.junit.Test
    public void uniqueCharacters2() throws Exception {

        String test = "anagram";

        assertFalse("n,g,r,m", false);
    }

    @org.junit.Test
    public void uniqueCharacters3() throws Exception {

        String test = "anagram";

        assertTrue("n,g,r,m", false);
    }

}