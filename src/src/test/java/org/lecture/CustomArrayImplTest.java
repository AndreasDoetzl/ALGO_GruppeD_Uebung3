package src.test.java.org.lecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomArrayImplTest {

    private CustomArrayImpl customArray;

    @BeforeEach
    public void setUp() {
        customArray = new CustomArrayImpl(3);
    }
}