import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class Testnow11 {
    @Test
    public void test_JUnit() {
        System.out.println("A different failure");
        String str1="A different failure mismatch";
        assertEquals("A different failure", str1);
    }
}