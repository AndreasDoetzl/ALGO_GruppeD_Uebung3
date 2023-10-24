package src.main.java.org.lecture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    private static final String FILE_PATH="E:\\3.Semester\\ALGO\\19102023\\src\\main\\resources\\Numbers.csv";

    public void readNumbersFromCSV(CustomArray customArray) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        String line;
        while ((line = br.readLine()) != null){
            String[] values = line.split(",");
            for (String str : values) {
                int number = Integer.parseInt(str.trim());
                customArray.insert(number);
            }
        }
        br.close();
    }
}
