package main.java.org.lecture;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        CustomArray array = new CustomArrayImpl(10);
        FileHandler fileHandler = new FileHandler();

        try {
            fileHandler.readNumbersFromCSV(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ((CustomArrayImpl)array).sort();
        ((CustomArrayImpl)array).printArray();
    }
}
