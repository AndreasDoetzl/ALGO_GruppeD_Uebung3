package main.java.org.lecture;

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

    @Override
    public int length() {
        return data.length;
    }


    public void sort() {
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


