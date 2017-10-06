import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class FavouriteAnimals {
    public static void main(String[] args) throws IOException {
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them

        System.out.println("java FavouriteAnimals [animal] [animal]");
        favouriteAdder();

    }
    public static void favouriteAdder() throws IOException {
        System.out.println("Add your favourite animal to the list!");
        Scanner scTask = new Scanner(System.in);
        String inputAdd = scTask.next();

        Path myPath = Paths.get("C:/Users/Gemini006/greenfox/pallida-exam-basics/src/favourites.txt");
        List<String> newList = Files.readAllLines(myPath);

        try {
            StringBuilder sb = new StringBuilder();
            sb.append(newList.size()+1);
            sb.append(" - ");
            sb.append(inputAdd);
            String stringIn = sb.toString();
            newList.clear();
            newList.add(stringIn);

            Files.write(myPath, newList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write file: favourites.txt");
        }
    }
}