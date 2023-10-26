package main.java.org.lecture;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

      //  CustomArray array = new CustomArrayImpl(10);
        FileHandler fileHandler = new FileHandler();

        try {
            CustomArray array = fileHandler.readNumbersFromCSV();
            CustomArraySorter sorter = new SelectionSort();
            sorter.sort(array);
            //   ((CustomArrayImpl) array).sort();
            ((CustomArrayImpl) array).printArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
