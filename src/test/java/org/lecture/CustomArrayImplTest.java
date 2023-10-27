package org.lecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomArrayImplTest {

   private CustomArrayImpl customArray;

    @BeforeEach
    public void setUp() {
        customArray = new CustomArrayImpl(3);
    }
    @Test
    public void testInsert() {

        customArray.insert(10);
        customArray.insert(5);

        assertEquals(5, customArray.getValue(1));

    }

    @Test
    public void testRemove() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        customArray.remove(5);

        assertEquals(10, customArray.getValue(0));
        assertNull(customArray.getValue(1));
        assertEquals(15, customArray.getValue(2));

    }

    @Test
    public void testSort() {

        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        CustomArraySorter sorter = new SelectionSort();
        sorter.sort(customArray);

        assertEquals(5, customArray.getValue(0));
        assertEquals(10, customArray.getValue(1));
        assertEquals(15, customArray.getValue(2));
    }

    @Test
    public void testNextFree() {

    }
}