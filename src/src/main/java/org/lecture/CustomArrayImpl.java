package src.main.java.org.lecture;

public class CustomArrayImpl implements CustomArray {

    private Integer[] data;


    public CustomArrayImpl(int size) {
        this.data = new Integer[size];
    }

    @Override
    public int nextFree() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insert(Integer value) {
        int index = nextFree();
        if (index != -1) {
            data[index] = value;
        } else {
        }
    }

    @Override
    public void remove(Integer value) {
        for (int i = 0; i < data.length; i++) {
            if (value.equals(data[i])) {
                data[i] = null;
                break;
            }
        }
    }


    public void sort() {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] != null && data[min_idx] != null) {
                    if (data[j] < data[min_idx]) {
                        min_idx = j;
                    }
                }
            }
            Integer temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }

    public void printArray() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}


