package org.lecture;

import java.io.IOException;


/**
 * Liest Zahlen aus dem File src/main/resources/Numbers.csv aus und liefert diese in dem Abstrakten Daten Typ {@link CustomArray} retour. </br>
 * Sortiert diese Zahlen danach aufsteigend und gibt sie über die Konsole aus.</br>
 * </br>
 * @author Andreas Dötzl
 * @author Reihs Matthias
 * @author Miklos Komlosy
 *
 */
public class Main {

    public static void main(String[] args) {

        FileHandler fileHandler = new FileHandler();

        try {
            CustomArray array = fileHandler.readNumbersFromCSV();
            CustomArraySorter sorter = new SelectionSort();
            sorter.sort(array);
            ((CustomArrayImpl) array).printArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
