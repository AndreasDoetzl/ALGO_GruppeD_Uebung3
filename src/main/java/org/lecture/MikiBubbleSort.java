package org.lecture;

public class MikiBubbleSort implements CustomArraySorter {
    /**
     * Eine Implementierung des BubbleSort-Algorithmus für die CustomArraySorter-Schnittstelle.
     */
    @Override
    public void sort(CustomArray array) {
        int n = array.length();

        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - 1; i++) {
                Integer testedNumber = array.getValue(i);
                Integer nextNumber = array.getValue(i + 1);
                if (testedNumber > nextNumber) {
                    array.setValue(i, nextNumber);
                    array.setValue((i + 1), testedNumber);
                }
            }
            n -= 1;
        }
        System.out.println("\nBubble sort done");
    }
}
