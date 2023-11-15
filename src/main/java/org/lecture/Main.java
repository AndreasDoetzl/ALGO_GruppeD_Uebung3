package org.lecture;

import java.io.IOException;


/**
 * Liest Zahlen aus dem File src/main/resources/Numbers.csv aus und liefert diese in dem Abstrakten Daten Typ {@link CustomArray} retour. </br>
 * Sortiert diese Zahlen danach aufsteigend und gibt sie über die Konsole aus.</br>
 * </br>
 *
 * @author Andreas Dötzl
 * @author Matthias Reihs
 * @author Miklos Komlosy
 */
public class Main {

    public static void main(String[] args) {

        FileHandler fileHandler = new FileHandler();

        try {
            CustomArray array = fileHandler.readNumbersFromCSV();
            System.out.println("\nThe array without previous sorting:");
            System.out.println(array.toString());
            //   CustomArraySorter sorter = new SelectionSort();
           // CustomArraySorter bubbleSort = new MikiBubbleSort();
            CustomArraySorter mergeSort = new MikiMergeSort();
              mergeSort.sort(array);
            //  sorter.sort(array);
            //bubbleSort.sort(array);
            System.out.println(array.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
