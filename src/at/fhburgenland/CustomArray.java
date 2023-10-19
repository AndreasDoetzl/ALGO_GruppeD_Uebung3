package at.fhburgenland;

public interface CustomArray {

    /**
     *
     * @return  sucht die nächste freie Stelle im Array und gibt den Index zurück
     */
    int nextFree();

    /**
     * fügt ein neues Element x hinzu
     * @param value
     */
    void insert(Integer value);

    /**
     * löscht ein Element x
     * @param value
     */
    void remove(Integer value);

}
