package testA;

import adi.practice.testA.Simple;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {
    @Test
    public void addIntegerReturnCheck(){
        var s1 = new Simple();
        assertEquals(10, s1.addIntegers(3,7));
    }
}
