package main.java.org.lecture;


/**
 * Eine Schnittstelle, die die Operationen für ein benutzerdefiniertes Array definiert.
 */public interface CustomArray {

    /**
     * Sucht die nächste freie Stelle im Array und gibt den Index zurück.
     * @return Der Index der nächsten freien Stelle.
     */
    int nextFree();

    /**
     * Fügt ein neues Element in das Array ein.
     * @param value Das einzufügende Element.
     */
    void insert(Integer value);

    /**
     * Löscht ein Element aus dem Array.
     * @param value Das zu löschende Element.
     */
    void remove(Integer value);

    /**
     * Liefert die Größe des Arrays.
     * @return Die Größe des Arrays.
     */
    int length();

    Integer get(int index);

    void set(int index, Integer value);

}
