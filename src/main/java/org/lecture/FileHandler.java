package main.java.org.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {

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
