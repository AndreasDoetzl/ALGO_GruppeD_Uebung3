package main.java.org.lecture;

/**
 * Eine Implementierung der CustomArray-Schnittstelle.
 */
public class CustomArrayImpl implements CustomArray {

    private Integer[] data;

    /**
     * Konstruktor für die CustomArrayImpl-Klasse.
     * @param size Die Größe des Arrays.
     */
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

    /**
     * Sortiert das gegebene CustomArray.
     * @param
     */
    public void sort() {

    }

    /**
     * Gibt den Wert an der angegebenen Position im Array zurück.
     *
     * @param index Der Index, an dem der Wert abgerufen werden soll.
     * @return Der Wert an der angegebenen Position oder -1, wenn der Index ungültig ist.
     */
    @Override
    public Integer get(int index) {
        if (index > 0 && index < data.length) {
            return data[index];
        }
        return -1;
    }

    @Override
    public void set(int index, Integer value) {
        if (index >= 0 && index < data.length) {
            data[index] = value;
        }
    }


    /**
     * Gibt das Array aus.
     */
    public void printArray() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}


