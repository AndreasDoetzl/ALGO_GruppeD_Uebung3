package org.lecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testklasse für CustomArrayImpl.
 * Stellt Unit-Tests bereit, um die Funktionalität der Methoden von CustomArrayImpl zu überprüfen.
 */
public class CustomArrayImplTest {

    private CustomArrayImpl customArray;

    /**
     * Richtet die Testumgebung vor jedem Test ein.
     * Initialisiert eine Instanz von CustomArrayImpl mit einer festgelegten Größe.
     */
    @BeforeEach
    public void setUp() {
        customArray = new CustomArrayImpl(3);
    }

    /**
     * Testet das Einfügen von Elementen in das CustomArrayImpl.
     * Überprüft, ob die Elemente korrekt eingefügt werden und die String-Repräsentation des Arrays korrekt ist.
     */
    @Test
    public void testInsert() {
        customArray.insert(10);
        customArray.insert(5);

        assertEquals(10, customArray.getValue(0));
        assertEquals(5, customArray.getValue(1));
        assertEquals("[10, 5, null]", customArray.toString());
    }

    /**
     * Testet das Einfügen von Elementen auf Ausnahmeverhalten.
     * Stellt sicher, dass eine ArrayIndexOutOfBoundsException geworfen wird, wenn versucht wird, über die Grenzen des Arrays hinweg einzufügen.
     */
    @Test
    public void testInsertException() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> customArray.insert(20));
    }

    /**
     * Testet das Entfernen eines Elements aus dem CustomArrayImpl.
     * Überprüft den Inhalt des Arrays nach dem Entfernen eines Elements.
     */
    @Test
    public void testRemove() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        customArray.remove(5);

        assertEquals("[10, null, 15]", customArray.toString());
    }

    /**
     * Testet das Sortieren des CustomArrayImpl mithilfe einer spezifischen Sortierstrategie.
     * Überprüft, ob das Array wie erwartet sortiert wird.
     */
    @Test
    public void testSort() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        CustomArraySorter sorter = new SelectionSort();
        sorter.sort(customArray);

        assertEquals("[5, 10, 15]", customArray.toString());
    }

    /**
     * Testet die Methode nextFree, wenn das Array voll ist.
     * Überprüft, dass die Methode -1 zurückgibt, wenn kein freier Platz verfügbar ist.
     */
    @Test
    public void testNextFreeFull() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        assertEquals(-1, customArray.nextFree());
    }

    /**
     * Testet die Methode nextFree, wenn noch Platz im Array ist.
     * Überprüft, dass die Methode den Index des nächsten freien Platzes zurückgibt.
     */
    @Test
    public void testNextFree() {
        customArray.insert(10);
        customArray.insert(5);

        assertEquals(2, customArray.nextFree());
    }

    /**
     * Testet die Methode getValue für den Zugriff außerhalb der Array-Grenzen.
     * Überprüft, ob null zurückgegeben wird, wenn auf Indizes außerhalb der Array-Größe zugegriffen wird.
     */
    @Test
    public void testGetValue() {
        assertNull(customArray.getValue(4));
        assertNull(customArray.getValue(1));
    }

    /**
     * Testet die Methode setValue sowohl für gültige als auch für ungültige Operationen.
     * Überprüft, ob der korrekte Wert für einen gültigen Index gesetzt wird und eine Ausnahme für einen ungültigen Index geworfen wird.
     */
    @Test
    public void testSetValue() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        customArray.setValue(0, 20);
        assertEquals("[20, 5, 15]", customArray.toString());
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> customArray.setValue(4, 5));
    }
}
