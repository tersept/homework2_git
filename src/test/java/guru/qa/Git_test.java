package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Git_test {
    @Test
    void firstTest(){
        Assertions.assertTrue(3>1);
    }
    void secondTest(){
        Assertions.assertTrue(31>1);
    }
    void thirdTest(){
        Assertions.assertFalse(31<1);
    }

}
