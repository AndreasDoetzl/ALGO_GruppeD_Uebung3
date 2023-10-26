package java.org.lecture;
import main.java.org.lecture.CustomArray;
import main.java.org.lecture.CustomArrayImpl;
import main.java.org.lecture.CustomArraySorter;
import main.java.org.lecture.SelectionSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(5, customArray.get(1));

    }

    @Test
    public void testRemove() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        customArray.remove(5);

        assertEquals(10, customArray.get(0));
        assertEquals(-1, customArray.get(1));
        assertEquals(15, customArray.get(2));

    }

    @Test
    public void testSort() {

        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        CustomArraySorter sorter = new SelectionSort();
        sorter.sort(customArray);

        assertEquals(5, customArray.get(0));
        assertEquals(10, customArray.get(1));
        assertEquals(15, customArray.get(2));
    }

    @Test
    public void testNextFree() {

    }
}