import java.util.ArrayList;
import java.util.Collections;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
       System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]

    }

    public static ArrayList<Character> uniqueCharacters(String input) {
        ArrayList<Character> temp = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();


        for (int i = 0; i < input.length(); i++) {
            temp.get(input.charAt(i));
        }
        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) != temp.get(i-1)) {
                result.add(temp.get(i));
            }
        }
        return result;
    }
}








