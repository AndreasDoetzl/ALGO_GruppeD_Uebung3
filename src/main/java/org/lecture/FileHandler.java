package main.java.org.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Eine Klasse, die sich um das Lesen von Zahlen aus einer CSV-Datei kümmert und ein CustomArray erstellt.
 */
public class FileHandler {

    /**
     * Liest Zahlen aus einer CSV-Datei und erstellt ein CustomArray.
     * @return Ein CustomArray, das die gelesenen Zahlen enthält.
     */
    public CustomArray readNumbersFromCSV() throws IOException {
        Path path = Paths.get("src/main/resources/Numbers.csv");
        String allLines = Files.readString(path);
        String[] allNumbers = allLines.split(",");
        CustomArray customArray = new CustomArrayImpl(allNumbers.length);
        for (String aNumber : allNumbers) {
            int number = Integer.parseInt(aNumber.trim());
            customArray.insert(number);
        }
        return customArray;
    }
}
