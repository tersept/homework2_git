package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Git_test {
    @Test
    void firstTest(){
        Assertions.assertFalse(3<1);
    }
    void secondTest(){
        Assertions.assertTrue(31>1);
    }
    void thirdTest(){
        Assertions.assertFalse(4<6);
    }

}
