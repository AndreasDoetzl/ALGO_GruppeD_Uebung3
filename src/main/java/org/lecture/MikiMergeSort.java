package org.lecture;

public class MikiMergeSort implements CustomArraySorter {

    /**
     * Eine Implementierung des MergeSort-Algorithmus für die CustomArraySorter-Schnittstelle.
     */
    @Override
    public void sort(CustomArray array) {
        mergeSort(array.getArray());
        System.out.println("\nMerge sort done");
    }

    private static void mergeSort(Integer[] inputArray) {
        int n = inputArray.length;
        if (n < 2) {
            return;
        }
        Integer[] subdivisionHalf1 = new Integer[n / 2];
        Integer[] subdivisionHalf2 = new Integer[n - n / 2];

        int midIndex = n / 2;
        for (int i = 0; i <= midIndex - 1; i++) {
            subdivisionHalf1[i] = inputArray[i];
        }
        for (int i = midIndex; i < n; i++) {
            subdivisionHalf2[i - midIndex] = inputArray[i];
        }
        mergeSort(subdivisionHalf1);
        mergeSort(subdivisionHalf2);

        merge(inputArray, subdivisionHalf1, subdivisionHalf2);


    }

    private static void merge(Integer[] inputArray, Integer[] subdivisionHalfLeft, Integer[] subdivisionHalfRight) {
        int sizeHalfLeft = subdivisionHalfLeft.length;
        int sizeHalfRight = subdivisionHalfRight.length;

        int i = 0, j = 0, k = 0;

        while (i < sizeHalfLeft && j < sizeHalfRight) {
            if (subdivisionHalfLeft[i] != null &&
                    (subdivisionHalfRight[j] == null ||
                            subdivisionHalfLeft[i] <= subdivisionHalfRight[j])) {
                inputArray[k] = subdivisionHalfLeft[i];
                i++;
            } else {
                inputArray[k] = subdivisionHalfRight[j];
                j++;
            }
            k++;
        }

        while (i < sizeHalfLeft) {
            inputArray[k] = subdivisionHalfLeft[i];
            i++;
            k++;
        }

        while (j < sizeHalfRight) {
            inputArray[k] = subdivisionHalfRight[j];
            j++;
            k++;
        }
    }
}


