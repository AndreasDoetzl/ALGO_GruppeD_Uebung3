package main.java.org.lecture;

public interface CustomArray {

    /**
     * @return sucht die nächste freie Stelle im Array und gibt den Index zurück
     */
    int nextFree();

    /**
     * fügt ein neues Element in das Array ein.
     *
     * @param value
     */
    void insert(Integer value);

    /**
     * löscht ein Element x
     *
     * @param value
     */
    void remove(Integer value);

    /**
     * liefert die größe des Arrays.
     *
     * @return size
     */
    int length();
}
