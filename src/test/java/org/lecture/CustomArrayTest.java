package java.org.lecture;

import main.java.org.lecture.CustomArray;
import main.java.org.lecture.CustomArrayImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomArrayTest {

    public void testInsert() {
        CustomArray array = new CustomArrayImpl(5);
        array.insert(10);
        array.insert(5);

       // assertEquals();

    }
}
