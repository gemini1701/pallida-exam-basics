import static org.junit.Assert.*;

public class UniqueCharsTest {
    @org.junit.Test
    public void uniqueCharacters() throws Exception {

        String test = "anagram";

        assertEquals("n,g,r,m", "n,g,r,m");
    }

    public void uniqueCharacters1() throws Exception {
        String test = "anagram";
        assertEquals("n,g,r,m", "n,g,r,v");
    }

}