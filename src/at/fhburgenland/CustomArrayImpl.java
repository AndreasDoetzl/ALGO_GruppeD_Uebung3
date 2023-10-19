package at.fhburgenland;

public class CustomArrayImpl implements CustomArray{

    public Integer[] data;


    public CustomArrayImpl(int size) {
        this.data = new Integer[size];

    }


    @Override
    public int nextFree() {
        for (int i = 0; i < data.length; i++) {
            return 0;
        }
        return 0;
    }

    @Override
    public void insert(Integer value) {
        for (int i = 0; i < data.length; i++) {

        }
        }

    @Override
    public void remove(Integer value) {

    }


}
