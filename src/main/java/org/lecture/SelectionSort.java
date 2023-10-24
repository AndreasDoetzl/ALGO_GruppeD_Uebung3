package main.java.org.lecture;

public class SelectionSort implements CustomArraySorter {

    @Override
    public void sort(CustomArray customArray) {
        int n = customArray.length();

//        for (int i = 0; i < n - 1; i++) {
//            int min_idx = i;
//            for (int j = i + 1; j < n; j++) {
//                if (customArray[j] != null && customArray[min_idx] != null) {
//                    if (customArray[j] < customArray[min_idx]) {
//                        min_idx = j;
//                    }
//                }
//            }
//            Integer temp = customArray[min_idx];
//            customArray[min_idx] = customArray[i];
//            customArray[i] = temp;
//        }

    }
}
