package org.lecture;

public class SelectionSort implements CustomArraySorter {
/**
 * Eine Implementierung des SelectionSort-Algorithmus für die CustomArraySorter-Schnittstelle.
 */
    @Override
    public void sort(CustomArray array) {
        int n = array.length();

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array.get(j) != null && array.get(min_idx) != null) {
                    if (array.get(j) < array.get(min_idx)) {
                        min_idx = j;
                    }
                }
            }
            Integer temp = array.get(min_idx);
            array.set(min_idx, array.get(i)); // Verwende set, um den Wert zu ändern
            array.set(i, temp); // Verwende set, um den Wert zu ändern
        }
/*
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array.get(j) != null && array[min_idx] != null) {
                    if (array[j] < array[min_idx]) {
                        min_idx = j;
                    }
                }
            }
            Integer temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }


 */
    }
}
